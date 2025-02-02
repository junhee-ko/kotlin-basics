package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `6_Classes` {

    // 1. Properties
    class Person(val name: String, var age: Int)

    @Test
    fun properties() {
        val person = Person("John", 25)
        assertEquals("John", person.name)
        assertEquals(25, person.age)
    }

    // 2. Constructor
    class Car(val model: String, var year: Int)

    @Test
    fun constructor() {
        val car = Car("Toyota", 2020)
        assertEquals("Toyota", car.model)
        assertEquals(2020, car.year)
    }

    // 3. Access Properties
    class Dog(val name: String, val age: Int)

    @Test
    fun accessProperties() {
        val dog = Dog("Love", 3)
        assertEquals(3, dog.age)
    }

    // 4. Member Functions
    class Rectangle(val width: Int, val height: Int) {
        fun area(): Int {
            return width * height
        }
    }

    @Test
    fun memberFunctions() {
        val rectangle = Rectangle(5, 10)
        assertEquals(50, rectangle.area())
    }

    // 5. Data Class
    data class Book(val title: String, val author: String, val year: Int)

    @Test
    fun dataClass() {
        val book01 = Book("Kotlin for Beginners", "Jane Doe", 2022)

        // properties
        assertEquals("Kotlin for Beginners", book01.title)
        assertEquals("Jane Doe", book01.author)
        assertEquals(2022, book01.year)

        // toString
        assertEquals("Book(title=Kotlin for Beginners, author=Jane Doe, year=2022)", book01.toString())

        // equals
        val book02 = Book("Kotlin for Beginners", "Jane Doe", 2022)
        assertEquals(book02, book01)

        // copy
        val newBook = book01.copy(year = 2023)
        assertEquals(2023, newBook.year)
    }
}
