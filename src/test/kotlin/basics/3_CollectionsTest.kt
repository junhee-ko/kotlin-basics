package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class `3_CollectionsTest` {

    // 1. Lists
    @Test
    fun immutableList() {
        val immutableList: List<String> = listOf("Apple", "Banana", "Cherry")

        assertEquals("Apple", immutableList[0])
        assertEquals(3, immutableList.size)
        assertTrue(immutableList.contains("Banana"))

        // Cannot modify immutable list
        // immutableList.add("Mango")
        // immutableList[0] = "Mango"
    }

    @Test
    fun mutableList() {
        val mutableList: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")

        mutableList.add("Mango")
        mutableList.remove("Banana")
        mutableList[0] = "Orange"

        assertEquals(mutableListOf("Orange", "Cherry", "Mango"), mutableList)
    }

    // 2. Sets
    @Test
    fun immutableSet() {
        val immutableSet: Set<Int> = setOf(1, 2, 3, 3, 4, 4, 5)

        // immutableSet.add("Swift")

        assertEquals(5, immutableSet.size)
    }

    @Test
    fun mutableSet() {
        val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Python")

        mutableSet.add("Swift")
        mutableSet.remove("Java")

        assertEquals(3, mutableSet.size)
    }

    // 3. Maps
    @Test
    fun immutableMap() {
        val immutableMap: Map<String, Int> = mapOf("Apple" to 100, "Banana" to 200)

//        immutableMap.remove("Banana")

        assertEquals(100, immutableMap["Apple"])
        assertEquals(200, immutableMap["Banana"])
    }

    @Test
    fun mutableMap() {
        val mutableMap: MutableMap<String, Int> = mutableMapOf("Apple" to 100, "Banana" to 200)

        mutableMap["Apple"] = 150
        mutableMap.remove("Banana")

        assertEquals(150, mutableMap["Apple"])
        assertEquals(null, mutableMap["Banana"])
    }
}