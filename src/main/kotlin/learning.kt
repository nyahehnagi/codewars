package learning

fun accum(s: String): String {
    // your codes
    var count: Int = 0
    var newString: String = ""

    s.forEach {
        if (count > 0) {
            newString = newString + "-"
        }
        newString = newString + it.toUpperCase()

        for (i in 1..count) {
            newString = newString + it.toLowerCase()
        }
        count++
    }
    return newString
}

fun persistence(num: Int): Int {
    var newValue = 1

    var temp = num
    val digits: MutableList<Int> = mutableListOf()

    do {
        digits.add(temp % 10)
        temp /= 10
    } while (temp > 0)

    return if (digits.count() == 1)
        0
    else {
        digits.forEach {
            newValue = newValue * it
        }
        persistence(newValue) + 1
    }
}

fun longestConsec(strarr: Array<String>, k: Int): String {
    var tmpString = ""
    val rtnValue: String

    if (k == 0 || k > strarr.size || k <= 0) {
        return ""
    }

    if (strarr.size == k) {
        for (i in 0..k - 1) {
            tmpString = tmpString + strarr[i]
        }
        return tmpString
    } else {
        for (i in 0..k - 1) {
            tmpString = tmpString + strarr[i]
        }

        rtnValue = longestConsec(strarr.takeLast(strarr.size - 1).toTypedArray(), k)
        if (tmpString.length >= rtnValue.length) {
            return tmpString
        } else {
            return rtnValue
        }
    }
}

fun isLeapYear(year: Int): Boolean {
    if (year % 400 == 0) {
        return true
    }

    if (year % 100 == 0) {
        return false
    }

    if (year % 4 == 0) {
        return true
    }

    return false
}

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {

    var daysEvaporating = 0
    var whatsLeft: Double = content

    while (whatsLeft > (content * threshold / 100)) {
        whatsLeft -= (whatsLeft * evap_per_day / 100)
        daysEvaporating += 1
    }

    return daysEvaporating

}

fun printerError(s: String): String {

    //val errorCharacters = "nopqrstuvwxyz"
    return s.filter { it in 'n'..'z' }.count().toString() + "/" + s.length.toString()

}

fun partlist(arr: Array<String>): Array<Array<String>> {

    val newArr: ArrayList<Array<String>> = ArrayList()
    for (i in 1 until arr.size) {
        newArr.add(arrayOf(arr.copyOfRange(0, i).joinToString(" "), arr.copyOfRange(i, arr.size).joinToString(" ")))
    }
    return newArr.toTypedArray()

    /*
       return (0 until arr.size - 1)
            .map {
                arrayOf(
                        arr.sliceArray(0..it).joinToString(" "),
                        arr.sliceArray(it + 1 until arr.size).joinToString(" ")
                )
            }.toTypedArray()
     */
}

fun whoIsNext(names: List<String>, n: Int): String {

    val tmpList: MutableList<String> = mutableListOf()
    var counter = 0
    var numberOfWords = 1
    var moveCount = 0

    if (n < names.size) {
        return names[n - 1]
    }

    /* while ((moveCount + (names.size * numberOfWords)) < n) {
         if (counter == 0) {
             numberOfWords = 1
         } else {
             numberOfWords *= 2
         }
         counter += 1
         moveCount += (names.size * numberOfWords)
     }*/
    var tmpValue: Int
    do {
        if (counter == 0) {
            numberOfWords = 1
        } else {
            numberOfWords *= 2
        }
        counter += 1
        tmpValue = moveCount + (names.size * numberOfWords)
        if (tmpValue < n) {
            moveCount += (names.size * numberOfWords)
        }
    } while ((moveCount + (names.size * numberOfWords)) < n)


    names.forEach {
        counter = numberOfWords
        while (counter > 0) {
            tmpList.add(it)
            tmpList.add(it)
            counter -= 1
        }
    }

    return tmpList[n - moveCount - 1]

}


/*
fun whoIsNext(names: List<String>, n: Int): String {

    val tmpList: MutableList<String> = names.toMutableList()
    var counter : Int = n
    var tmpString : String

    while (counter > 1) {
        tmpString = tmpList[0]
        tmpList.add(tmpString)
        tmpList.add(tmpString)
        tmpList.removeAt(0)
        counter -= 1
    }

    return tmpList[0]

}
 */