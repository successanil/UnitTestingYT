package com.androiddevs.unittestingyt

import com.google.common.truth.Truth
import org.junit.Test


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


}