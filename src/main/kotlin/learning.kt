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