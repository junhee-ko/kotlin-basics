package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class `7_NullSafety` {

    // 1. Nullable Types
    @Test
    fun nullableTypes() {
        val name: String? = "Kotlin"
        val nullName: String? = null

        assertEquals("Kotlin", name)
        assertNull(nullName)
    }

    // 2. Check for Null Values
    @Test
    fun checkForNullValues() {
        val name: String? = "Kotlin"
        val nullName: String? = null

        if (name != null) {
            assertEquals("Kotlin", name)
        } else {
            assertNull(name)
        }
    }

    // 3. Safe Calls (?.)
    @Test
    fun safeCalls() {
        val name: String? = "Kotlin"
        val nullName: String? = null

        val length = name?.length
        val nullLength = nullName?.length

        assertEquals(6, length)
        assertNull(nullLength)
    }

    // 4. Elvis Operator (?:)
    @Test
    fun elvisOperator() {
        val name: String? = null

        val result = name ?: "Default Name"
        assertEquals("Default Name", result)

        val nullableLength: Int? = name?.length ?: 0
        assertEquals(0, nullableLength)
    }
}
