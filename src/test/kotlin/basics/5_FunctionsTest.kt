package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class `5_FunctionsTest` {

    @Test
    fun namedArguments() {
        val result = greet(name = "Junhee", age = 30)   // here
        assertEquals("Hello, my name is Junhee and I am 30 years old.", result)
    }

    // 1. Named Arguments
    private fun greet(name: String, age: Int) = "Hello, my name is $name and I am $age years old."

    @Test
    fun defaultParameterValues() {
        assertEquals("Hello, Guest!", greetWithDefault())
        assertEquals("Hello, Ko!", greetWithDefault("Ko"))
    }

    // 2. Default Parameter Values
    private fun greetWithDefault(name: String = "Guest") = "Hello, $name!"

    // 3. Functions Without Return
    @Test
    fun returnTypeOfFunctionsWithoutReturnIsUnit(): Unit {
        println("returnTypeOfFunctionsWithoutReturnIsUnit")
    }

    // 4. Single Expression Functions
    @Test
    fun singleExpressionFunctions() {
        assertEquals(25, square(5))
    }

    private fun square(x: Int) = x * x

    // 5. Lambda Expressions
    val add: (Int, Int) -> Int = { a, b -> a + b }

    @Test
    fun lambdaExpressions() {
        assertEquals(7, add(3, 4))
    }
}
