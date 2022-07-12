package com.androiddevs.unittestingyt

import com.google.common.truth.Truth
import org.junit.Test


class LoginUtilTest {

    @Test
    fun `if username is empty return false`() {
        var result = LoginUtil.validateLoginInput("","123")
        Truth.assertThat(result).isFalse()
    }
    @Test
    fun `if password is empty return false`() {
        var result = LoginUtil.validateLoginInput("abc","")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `if username has chars other than _,digits and alphabet  return false`() {
        var result = LoginUtil.validateLoginInput("ab_c@","")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `if username and password combination doesn't match  return false`() {
        var result = LoginUtil.validateLoginInput("abc","1234")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `if username and password combination  match  return true`() {
        var result = LoginUtil.validateLoginInput("sunil","1234")
        Truth.assertThat(result).isTrue()
    }



}