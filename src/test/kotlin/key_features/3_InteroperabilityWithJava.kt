package key_features

import PersonJava
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `3_InteroperabilityWithJava` {

    @Test
    fun interoperability() {
        val javaObject = PersonJava("Junhee", 30)
        assertEquals("Junhee", javaObject.name)
        assertEquals(30, javaObject.age)

        javaObject.name = "Ko"
        javaObject.age = 50
        assertEquals("Ko", javaObject.name)
        assertEquals(50, javaObject.age)

        javaObject.greet()
    }
}