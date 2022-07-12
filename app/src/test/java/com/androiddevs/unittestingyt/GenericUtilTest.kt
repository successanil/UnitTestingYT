package com.androiddevs.unittestingyt

import com.google.common.truth.Truth
import junit.framework.Assert.*
import org.junit.Test
import java.lang.NullPointerException


class GenericUtilTest {

    @Test
    fun `should return listOf primefactors` () {
        var result = GenericUtil.getPrimeFactor(100)
        Truth.assertThat(result).isEqualTo(mutableListOf(2,5))
    }

    @Test
    fun `should return true if no is prime`() {
        var result = GenericUtil.checkPrime(7)
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun `should return false if no is not prime`() {
        var result = GenericUtil.checkPrime(70)
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `should return nth term of AP for 2 first values`() {
        var result = GenericUtil.nthTermOfAP(2,3,4)
        Truth.assertThat(result).isEqualTo(5)
    }

    @Test
    fun `should return nth term of GP for one value and common ratio`() {
        var result = GenericUtil.nthTermofGP(5,2,3)
        Truth.assertThat(result).isEqualTo(20)
    }

    @Test
    fun `should not  return nth term of GP for one value and common ratio`() {
        var result = GenericUtil.nthTermofGP(5,2,3)
        assertFalse(result == 50)
    }


}