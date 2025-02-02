package key_features

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `2_ConciseAndExpressiveTest` {

    @Test
    fun function() {
        val result = sum(1, 3)
        assertEquals(4, result)
    }

    private fun sum(number1: Int, number2: Int) = number1 + number2

    @Test
    fun dataclass() {
        val person = Person("Junhee", 30)
        assertEquals("Junhee", person.name)
        assertEquals(30, person.age)

        val olderPerson = person.copy(age = 50)
        assertEquals("Junhee", olderPerson.name)
        assertEquals(50, olderPerson.age)
    }

    data class Person(val name: String, val age: Int)

    @Test
    fun lambda() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val squaredNumbers = numbers.map { it * it }

        assertEquals(listOf(1, 4, 9, 16, 25), squaredNumbers)
    }

    @Test
    fun nullSafety() {
        val name: String? = null
        val result = name ?: "Default"
        assertEquals("Default", result)
    }

    @Test
    fun stringTemplates() {
        val name = "Kotlin"
        val version = 2.0
        val info = "Language: $name, Version: $version"
        assertEquals("Language: Kotlin, Version: 2.0", info)
    }

    @Test
    fun extensionFunction() {
        val text = "Hello "
        val repeated = text.repeatCustom(3)
        assertEquals("Hello Hello Hello ", repeated)
    }

    fun String.repeatCustom(times: Int): String = this.repeat(times)

    @Test
    fun destructuringDeclarations() {
        val point = Point(10, 20)
        val (x, y) = point
        assertEquals(10, x)
        assertEquals(20, y)
    }

    data class Point(val x: Int, val y: Int)
}