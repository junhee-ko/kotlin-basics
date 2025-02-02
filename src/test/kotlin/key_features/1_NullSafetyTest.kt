package key_features

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class `1_NullSafetyTest` {

    @Test
    fun nonNullableType() {
        val name: String = "Kotlin"
        assertNotNull(name)
    }

    @Test
    fun nullableType() {
        val nullableName: String? = null
        assertNull(nullableName)
    }

    @Test
    fun safeCall() {
        val nullableName: String? = null

        val length: Int? = nullableName?.length
        assertNull(length)

        val nonNullableName: String? = "Kotlin"
        val nonNullLength: Int? = nonNullableName?.length
        assertNotNull(nonNullLength)
    }

    @Test
    fun elvisOperator() {
        val nullableName: String? = null

        val lengthOrDefault: Int = nullableName?.length ?: 0
        assertEquals(0, lengthOrDefault)

        val nonNullableName: String? = "Kotlin"
        val nonNullLength: Int = nonNullableName?.length ?: 0
        assertEquals(6, nonNullLength)
    }

    @Test
    fun nonNullAssertion() {
        val nullableName: String? = null
        assertThrows<NullPointerException> { nullableName!!.length }

        val nonNullableName: String? = "Kotlin"
        val lengthNonNull = nonNullableName!!.length
        assertEquals(6, lengthNonNull)
    }
}