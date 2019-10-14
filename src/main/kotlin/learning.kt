package learning

import kotlin.math.ceil
import kotlin.math.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList


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

fun evenNumbers(array: List<Int>, number: Int): List<Int> {

    val evenNumbers = array.filter { it % 2 == 0 }

    return evenNumbers.subList(evenNumbers.size - number, evenNumbers.size)

}

fun longest(s1: String, s2: String): String = (s1 + s2).toSet().sorted().joinToString("")

fun reverseLetter(str: String): String = str.filter { it in 'a'..'z' }.reversed()
//return str.filter(Char::isLetter).reversed()

fun getMiddle(word: String): String {

    return if ((word.length).rem(2) == 0) {
        word.substring((word.length / 2 - 1)..(word.length / 2))
    } else {
        word.substring(word.length / 2..word.length / 2)
    }

}

fun findShort(s: String): Int {
    var shortest = s
    s.split(" ").forEach {
        if (it.length < shortest.length) {
            shortest = it
        }
    }
    return shortest.length
}

fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {

    if (a1.isEmpty() || a2.isEmpty()) {
        return -1
    }

    val minArray1 = a1.map { it.length }.min() ?: 0
    val maxArray1 = a1.map { it.length }.max() ?: 0

    val minArray2 = a2.map { it.length }.min() ?: 0
    val maxArray2 = a2.map { it.length }.max() ?: 0

    return max(abs(minArray1 - maxArray2), abs(maxArray1 - minArray2))

}

fun argsCount(vararg args: Any): Int {
    //return args.toList().count()
    return args.count()
}

fun wallpaper(l: Double, w: Double, h: Double): String {

    if ((l * w * h) <= 0) {
        return "zero"
    }

    val roomPerimeter = l.times(2).plus(w.times(2))
    val numberOfRolls = h.div(10) * roomPerimeter.div(.52)
    val extraRolls = numberOfRolls.times(15).div(100)

    val totalRolls = ceil(numberOfRolls.plus(extraRolls)).toInt()
    val numberWords = listOf(
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty"
    )

    return numberWords[totalRolls - 1]
}

fun nbDig(n: Int, d: Int): Int {

    val list = mutableListOf<String>()
    var counter = 0

    for (i in 0..n) {
        list.add((i * i).toString())
    }

    list.filter { d.toString() in it }.forEach {
        counter += it.split("").filter { it == d.toString() }.count()
    }

    return counter
}

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {

    var currentPopulation = pp0.toDouble()
    var yearCount = 0
    while (currentPopulation < p.toDouble()) {
        currentPopulation = (currentPopulation * (1 + (percent / 100))) + aug.toDouble()
        yearCount++
    }

    return yearCount
}

fun makeComplement(dna: String): String {
    //return dna.replace("A", "X").replace("G", "Y").replace("T","A").replace("C", "G").replace ("X", "T").replace("Y", "C")
    return dna.map {
        when (it) {
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            'G' -> 'C'
            else -> it
        }
    }.joinToString("")


}

fun gps(s: Int, x: DoubleArray): Int {

    if (x.sum() <= 1) return 0

    val averageSpeed = DoubleArray(x.size - 1) { i -> 3600 * (x[i + 1] - x[i]) / s }
    val maxAverageSpeedPerHour = averageSpeed.max()

    return floor(maxAverageSpeedPerHour!!).toInt()
}

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean =
    arr.containsAll(List(strng.length) { i -> strng.takeLast(strng.length - i) + strng.take(i) })

fun containAllRots1(strng: String, arr: ArrayList<String>): Boolean {
    return arr.containsAll(List(strng.length) { (strng.drop(it) + strng.take(it)) })
}

fun fizzBuzz(n: Int): Array<String> {
    var fizzBuzzArray = (1..n).toList().map { it.toString() }.toTypedArray()

    fizzBuzzArray.forEachIndexed() { index, ele ->
        if (ele.toInt().rem(3) == 0 && ele.toInt().rem(5) == 0) {
            fizzBuzzArray[index] = "FizzBuzz"
        } else if (ele.toInt().rem(5) == 0) {
            fizzBuzzArray[index] = "Buzz"
        } else if (ele.toInt().rem(3) == 0) {
            fizzBuzzArray[index] = "Fizz"
        }
    }

    return fizzBuzzArray
}

fun dateNbDays(a0:Double, a:Double, p:Double):String {

    val dailyInterstMultiplier = (p/36000) + 1
    var accumulatedAmount = a0
    var date  = LocalDate.of (2016,1, 1)


    while (accumulatedAmount < a){
        accumulatedAmount = accumulatedAmount * dailyInterstMultiplier
        date = date.plusDays(1)
    }

    return  date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
}

fun noSpace(x: String): String  = x.replace(" ","")

object GrassHopper {
    fun summation(n:Int):Int {
        //val listOfNumbers : List<Int> = listOf<Int>(1..n)
       //return listOfNumbers.fold(1){1 + it}
    }
}