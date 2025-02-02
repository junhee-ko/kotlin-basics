package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `2_BasicTypesTest` {

    @Test
    fun integers() {
        val intNumber: Int = 10
        val longNumber: Long = 10000000000L
        val shortNumber: Short = 1000
        val byteNumber: Byte = 127
    }

    @Test
    fun floatingPointNumbers() {
        val doubleNumber: Double = 3.1415
        val floatNumber: Float = 3.14F
    }

    @Test
    fun booleans() {
        val isKotlinFun: Boolean = true
        val isJavaBetter: Boolean = false
    }

    @Test
    fun characters() {
        val letter: Char = 'K'
        val digit: Char = '7'
    }

    @Test
    fun strings() {
        val kotlinString: String = "Hello, Kotlin!"
        val multilineString =
            """
                This is a
                multi-line string.
            """.trimIndent()
    }

    @Test
    fun typeConversions() {
        val number: Int = 10
        val doubleNumber: Double = number.toDouble()
        val stringNumber: String = number.toString()

        assertEquals(10.0, doubleNumber)
        assertEquals("10", stringNumber)
    }
}