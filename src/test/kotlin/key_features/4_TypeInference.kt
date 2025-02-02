package key_features

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class `4_TypeInference` {

    @Test
    fun noNeedToSpecifTypesExplicitly() {
        val name = "Kotlin"
        val age = 30
        val pi = 3.14
        val isRaining = true

        assertEquals("Kotlin", name)
        assertEquals(30, age)
        assertEquals(3.14, pi)
        assertEquals(true, isRaining)
    }

    @Test
    fun nullableTypes() {
        val nullableName: String? = null
        assertNull(nullableName)
    }
}