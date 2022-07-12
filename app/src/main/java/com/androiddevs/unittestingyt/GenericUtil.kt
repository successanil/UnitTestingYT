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

    fun nthTermOfAP(a:Int,b:Int,n:Int):Int{
        var next = 0
        var d = b - a
        for(i in 1..n) {
            next = a + ((i-1)*d)
        }
        return next
    }

    fun nthTermofGP(a:Int,r:Int,n:Int):Int{
        var nextterm = 0
        for(i in 0..n) {
            nextterm = (a.toDouble() * Math.pow(r.toDouble(),(i-1).toDouble())).toInt()
        }
        return nextterm
    }




}