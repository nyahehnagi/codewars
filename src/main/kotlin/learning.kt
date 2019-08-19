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