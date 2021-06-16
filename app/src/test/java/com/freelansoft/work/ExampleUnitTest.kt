package com.freelansoft.work

import com.freelansoft.work.dto.Plant
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    fun addition_isNotCorrect() {
        assertEquals(3, 1+2)
    }

    fun addFiveAndThree_EqualsEight() {
        assertEquals(8, 5 + 3)
    }

    fun confirmEasternRedbud_outputsEasternRedbud () {
        var plant: Plant = Plant("Cercis", "canadesis", "Eastern Redbud")
        assertEquals("Eastern Redbud", plant.toString());
    }

}