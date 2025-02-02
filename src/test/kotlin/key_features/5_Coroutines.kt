package key_features

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class `5_Coroutines` {

    @Test
    fun simpleExample() {
        runBlocking {
            launch {
                delay(1000L)
                println("Coroutine 1: Task completed")
            }

            launch {
                delay(2000L)
                println("Coroutine 2: Task completed")
            }

            println("Main program: Waiting for tasks to complete")
        }
    }
}