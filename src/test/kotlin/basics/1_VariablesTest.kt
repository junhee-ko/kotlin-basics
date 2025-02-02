package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `1_VariablesTest` {

    @Test
    fun valIsImmutableSoCannotBeReassigned() {
        val name = "Kotlin"
        // name = "Java"

        assertEquals("Kotlin", name)
    }

    @Test
    fun varIsMutableSoCanBeReassigned() {
        var age = 25
        age = 26

        assertEquals(26, age)
    }
}