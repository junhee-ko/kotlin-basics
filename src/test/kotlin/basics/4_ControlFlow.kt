package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class `4_ControlFlow` {

    // 1. Conditional expressions: if, when
    @Test
    fun `if`() {
        assertEquals(10, max(10, 5))
        assertEquals(7, max(3, 7))
    }

    private fun max(a: Int, b: Int): Int = if (a > b) a else b

    @Test
    fun `when`() {
        assertEquals("Negative", getNumberType(-5))
        assertEquals("Zero", getNumberType(0))
        assertEquals("Positive", getNumberType(8))
    }

    fun getNumberType(n: Int): String =
        when {
            n < 0 -> "Negative"
            n == 0 -> "Zero"
            n > 0 -> "Positive"
            else -> "Unknown"
        }


    // 2. Ranges
    @Test
    fun ranges() {
        assertTrue(1 in 1..10)
        assertTrue(10 in 1..10)
        assertTrue(13 !in 1..10)
    }

    // 3. Loops: for, while
    @Test
    fun `for`() {
        val numbers = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (num in numbers) {
            sum += num
        }

        assertEquals(15, sum)
    }

    @Test
    fun `while`() {
        var count = 0
        var total = 0

        while (count < 5) {
            total += count
            count++
        }

        // 0 + 1 + 2 + 3 + 4 = 10
        assertEquals(10, total)
    }

    @Test
    fun `do-while`() {
        var count = 0
        var sum = 0

        do {
            sum += count
            count++
        } while (count < 5)

        // 0 + 1 + 2 + 3 + 4 = 10
        assertEquals(10, sum)
    }
}
