package learning

import org.junit.Assert.*
import org.junit.Test
import java.util.Arrays
import java.util.Random


class LearninglTest {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed Tests accum")
        testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
        testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")

    }

    @Test
    fun `Basic Tests`() {
        assertEquals(3, persistence(39))
        assertEquals(0, persistence(4))
        assertEquals(2, persistence(25))
        assertEquals(4, persistence(999))
    }

    @Test
    fun testingLongestConsec() {
        println("longestConsec Fixed Tests")
        testing(
            longestConsec(
                arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"),
                2
            ), "abigailtheta"
        )
        testing(
            longestConsec(
                arrayOf<String>(
                    "ejjjjmmtthh",
                    "zxxuueeg",
                    "aanlljrrrxx",
                    "dqqqaaabbb",
                    "oocccffuucccjjjkkkjyyyeehh"
                ), 1
            ), "oocccffuucccjjjkkkjyyyeehh"
        )

    }


    @Test
    fun `Leap Year Test`() {
        assertEquals(false, isLeapYear(1234))
        assertEquals(true, isLeapYear(1984))
        assertEquals(true, isLeapYear(2000))
        assertEquals(false, isLeapYear(2010))
        assertEquals(false, isLeapYear(2013))
    }


}

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(22, evaporator(10.0,10.0,10.0))
        assertEquals(29, evaporator(10.0,10.0,5.0))
        assertEquals(59, evaporator(100.0,5.0,5.0))

    }
}

class TestExample1 {
    @Test
    fun testFixed() {
        assertEquals("3/56", printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("6/60", printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"))
        assertEquals("11/65", printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu"))
        assertEquals("0/53", printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmm"))
    }
}

class PartlistTest {
    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed Tests partlist")
        var s1 = arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")
        var a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
        testing(Arrays.deepToString(partlist(s1)), a)
        s1 = arrayOf<String>("I", "wish", "I", "hadn't", "come")
        a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
        testing(Arrays.deepToString(partlist(s1)), a)

    }
}

class DoubleColaTests {
    @Test
    fun testWhoIsNext() {
        val names = listOf("Sheldon", "Leonard", "Penny", "Rajesh", "Howard")
        assertEquals(whoIsNext(names, 52), "Penny")
        assertEquals(whoIsNext(names, 1), "Sheldon")
        assertEquals(whoIsNext(names, 6), "Sheldon")
        assertEquals(whoIsNext(names, 10), "Penny")
        assertEquals(whoIsNext(names, 16), "Sheldon")

       // assertEquals(whoIsNext(names, 52), "Penny")
        //assertEquals(whoIsNext(names, 76), "Sheldon")
       // assertEquals(whoIsNext(names, 7230702951), "Leonard")

    }


}

class CenturyTest {

    @Test fun testFixed() {
        assertEquals(18, century(1705));
        assertEquals(19, century(1900));
        assertEquals(17, century(1601));
        assertEquals(20, century(2000));
        assertEquals(1,  century(89));
    }
}

class MirrorTest {
    @Test
    fun `Basic Tests`() {
        assertEquals("*********\n* ehT   *\n* dlroW *\n*********", mirror("The World"))
        assertEquals("*********\n* olleH *\n* dlroW *\n*********", mirror("Hello World"))
        assertEquals("************\n* srawedoC *\n************", mirror("Codewars"))
    }
}

class MapsTest {
    @Test
    fun `Basic Tests`() {
        assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
        assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}

class PairsTest {
    @Test
    fun simpleTests() {
        assertEquals(2, duplicates(intArrayOf(1, 2, 5, 6, 5, 2)))
        assertEquals(4, duplicates(intArrayOf(1, 2, 2, 20, 6, 20, 2, 6, 2)))
        assertEquals(3, duplicates(intArrayOf(0, 0, 0, 0, 0, 0, 0)))
        assertEquals(1, duplicates(intArrayOf(1000, 1000)))
        assertEquals(0, duplicates(intArrayOf()))
        assertEquals(0, duplicates(intArrayOf(54)))
    }
}

class VowelCount {
    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}

class EvenNumbersTest {
    @Test
    fun basicTests() {
        assertEquals(listOf(4, 6, 8), evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
        assertEquals(listOf(-8, 26), evenNumbers(listOf(-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26), 2))
        assertEquals(listOf(6), evenNumbers(listOf(6, -25, 3, 7, 5, 5, 7, -3, 23), 1))
    }
}

class TwoToOneTest {
    @Test
    fun test() {
        println("longest Fixed Tests")
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))

    }

}

class TestReverseLetter {
    @Test
    fun `Basic Tests` () {
        val str = "krishan"
        assertEquals("nahsirk", reverseLetter("krishan"))
        assertEquals("nortlu", reverseLetter("ultr53o?n"))
        assertEquals("cba", reverseLetter("ab23c"))
        assertEquals("nahsirk", reverseLetter("krish21an"))
    }
}

class MiddleTest {
    @Test
    fun basicTest() {
        assertEquals("dd", getMiddle("middle"));
        assertEquals("es", getMiddle("test"));
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }
}

class FindShortestTest {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
    }
}

class MaxDiffLengthTest {
    @Test
    fun test() {
        println("mxdiflg Fixed Tests")
        var s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
        var s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
        assertEquals(13,mxdiflg(s1, s2))
        s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
        s2 = arrayOf<String>("bbbaaayddqbbrrrv")
        assertEquals(10,mxdiflg(s1, s2))

    }
}

class ArgsTest {
    @Test
    fun basicTests() {
        assertEquals(1, argsCount(100))
        assertEquals(3, argsCount(100, 2, 3))
        assertEquals(2, argsCount(32, 12))
        assertEquals(0, argsCount())
        assertEquals(1, argsCount("a string!"))
    }
    @Test
    fun anyTypeTest() {
        assertEquals(2, argsCount("a string!", Pair(1, "2")))
    }
}

class EasyWallpaperTest {
    @Test
    fun basicTests() {
        assertEquals("zero", wallpaper(0.0, 3.5, 3.0))
        assertEquals("ten", wallpaper(4.0, 3.5, 3.0))
        assertEquals("sixteen", wallpaper(6.3, 4.5, 3.29))
    }
}

class CountDigTest {
    private fun testing(actual: Int, expected: Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test() {
        println("Fixed Tests nbDig")
        testing(nbDig(11, 1), 6)
        testing(nbDig(11011, 2), 9481)
        testing(nbDig(5750, 0), 4700)


    }
}

class ArgeTest {

    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }
    @Test
    fun test1() {
        println("Fixed Tests: nbYear")
        testing(nbYear(1500, 5.0, 100, 5000), 15)
        testing(nbYear(1500000, 2.5, 10000, 2000000), 10)

    }

}

class DnaTest {
    @Test
    fun test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }
    @Test
    fun test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }

}

class GpsSpeedTest {
    @Test
    fun test1() {
        println("Fixed Tests: gps")
        var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
        testing(gps(20, x), 41)
        x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
        testing(gps(12, x), 219)

    }
    companion object {
        private fun randInt(min:Int, max:Int):Int {
            return min + (Math.random() * ((max - min) + 1)).toInt()
        }
        private fun testing(actual:Int, expected:Int) {
            assertEquals(expected, actual)
        }
    }
}

class rotationsMainTest {
    private fun testing(actual:Boolean, expected:Boolean) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed Tests containAllRots")
        var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
        testing(containAllRots("bsjq", a), true)
        a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
        testing(containAllRots("XjYABhR", a), false)

    }
}

class FizzBuzzTests {
    @Test
    fun `One Number`() {
        val expected = arrayOf("1")
        assertArrayEquals(expected, fizzBuzz(1))
    }

    @Test
    fun `Ten Numbers`() {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        assertArrayEquals(expected, fizzBuzz(10))
    }
}