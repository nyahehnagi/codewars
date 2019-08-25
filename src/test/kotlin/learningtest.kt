package learning

import org.junit.Assert.*
import org.junit.Test
import java.util.Arrays



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