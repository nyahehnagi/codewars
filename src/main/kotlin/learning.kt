package learning

import javax.lang.model.element.NestingKind
import kotlin.math.ceil

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

    var numberOfWords = 1
    var accumalatedMoveCount = names.size
    var prevAccumlatedMoveCount: Int


    if (n < names.size) {
        return names[n - 1]
    }

    do {
        numberOfWords *= 2
        prevAccumlatedMoveCount = accumalatedMoveCount
        accumalatedMoveCount += (names.size * numberOfWords)


    } while (n > accumalatedMoveCount)


    //val tmp: Double = (n.toDouble() - prevAccumlatedMoveCount) / numberOfWords
    return names[ceil((n.toDouble() - prevAccumlatedMoveCount) / numberOfWords).toInt() - 1]

}

fun century(number: Int): Int {

    return (number + 99) / 100
}

fun mirror(text: String): String {

    var counter = 1
    var firstAndLastLine = ""
    val stringParts = text.split(" ")
    var maxLength = 0
    var tmpString: String

    stringParts.forEach {
        if (it.length > maxLength) {
            maxLength = it.length
        }
    }
    while (counter <= (maxLength + 4)) {
        firstAndLastLine += "*"
        counter += 1
    }

    tmpString = firstAndLastLine + "\n"
    stringParts.forEach {
        if (it.length == maxLength) {
            tmpString = tmpString + "* " + it.reversed() + " *\n"
        } else {
            tmpString = tmpString + "* " + it.reversed()
            val tmpCount = maxLength - it.length + 1
            for (i in 1..tmpCount) tmpString += " "
            tmpString += "*\n"
        }
    }
    tmpString += firstAndLastLine

    println(tmpString)
    return tmpString
}

fun maps(x: IntArray): IntArray = x.map { value -> value.times(2) }.toIntArray()

fun duplicates(array: IntArray): Int =
    array.toList().groupingBy { it }.eachCount().filter { it.value > 1 }.map { (it.value / 2) }.sumBy { it }

fun getCount(str: String): Int {
    return str.filter { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' }.count()
}
