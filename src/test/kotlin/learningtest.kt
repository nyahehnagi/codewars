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