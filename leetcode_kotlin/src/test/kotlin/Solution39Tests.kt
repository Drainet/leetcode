package main.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Solution39Tests {

    @Test
    fun test1() {
        val result = Solution39().combinationSum(intArrayOf(7, 3, 2), 18)
        assertEquals(
            listOf(
                listOf(2, 2, 2, 2, 2, 2, 2, 2, 2),
                listOf(2, 2, 2, 2, 2, 2, 3, 3),
                listOf(2, 2, 2, 2, 3, 7),
                listOf(2, 2, 2, 3, 3, 3, 3),
                listOf(2, 2, 7, 7),
                listOf(2, 3, 3, 3, 7),
                listOf(3, 3, 3, 3, 3, 3)
            ),
            result
        )
    }
}
