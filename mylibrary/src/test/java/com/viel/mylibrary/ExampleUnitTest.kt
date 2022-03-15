package com.viel.mylibrary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun `library unit test`() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `library unit test 2`() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `library unit test 3  (fail)`() {
        assertEquals(1, 2 + 2)
    }
}