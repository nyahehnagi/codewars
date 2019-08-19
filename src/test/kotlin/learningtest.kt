package learning

import org.junit.Assert.*
import org.junit.Test


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