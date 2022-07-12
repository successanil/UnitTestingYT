package com.androiddevs.unittestingyt

import kotlin.math.sqrt

object GenericUtil {
    // if N < 0 , return null
    // n % 1 or n % n should always = 0 , should return list
    // if N > 1 , should return a list containing prime factors


    fun getPrimeFactor(n: Int): ArrayList<Int>? {
        var list = mutableListOf<Int>()
        for (i in 1..n) {
            if (n % i == 0) {
                if (i == 2 || ( i != 1 && i % 2 != 0 && checkPrime(i))) {
                    list.add(i)
                }
            }
        }



        return list as ArrayList<Int>


    }

    fun checkPrime(num : Int) : Boolean {
        var flag = true
        for (i in 2..num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = false
                break
            }
        }
        return flag
    }



}