package com.androiddevs.unittestingyt

import com.google.common.truth.Truth
import org.junit.Test


class HomeWork2Test {

    @Test
    fun `if input contains lowercase character return false`() {
        var result = HomeWork2.checkUpperCase("abc")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `if input is empty return false`() {
        var result = HomeWork2.checkUpperCase("")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `if input contains All upperCaseChars return true`() {
        var result = HomeWork2.checkUpperCase("ABC")
        Truth.assertThat(result).isTrue()
    }
}