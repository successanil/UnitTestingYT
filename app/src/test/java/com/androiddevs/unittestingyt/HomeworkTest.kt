package com.androiddevs.unittestingyt

import com.google.common.truth.Truth
import org.junit.Test


class HomeworkTest {


    @Test
    fun `if n is 0 return 0`() {
        var result = Homework.fib(0)
        Truth.assertThat(result).isEqualTo(0)
    }

    @Test
    fun `if n is 1 return 1`() {
        var result = Homework.fib(1)
        Truth.assertThat(result).isEqualTo(1)
    }

    @Test
    fun `if n is 2 return 1`() {
        var result = Homework.fib(2)
        Truth.assertThat(result).isEqualTo(1)
    }

    @Test
    fun `if n is 3 return 2`() {
        var result = Homework.fib(3)
        Truth.assertThat(result).isEqualTo(2)
    }

    @Test
    fun `if n is 4 return 3`() {
        var result = Homework.fib(4)
        Truth.assertThat(result).isEqualTo(3)
    }

    @Test
    fun `if n is 5 return 5`() {
        var result = Homework.fib(5)
        Truth.assertThat(result).isEqualTo(5)
    }


    @Test
    fun `for the input string (anil) it should return true`() {
        var result = Homework.checkBraces("(anil)")
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun `for the input string (anil it should return false`() {
        var result = Homework.checkBraces("(anil")
        Truth.assertThat(result).isFalse()
    }
}