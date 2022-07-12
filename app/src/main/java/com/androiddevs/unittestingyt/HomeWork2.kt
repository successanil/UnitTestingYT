package com.androiddevs.unittestingyt

object HomeWork2 {

    // if n contains any lower case character return false
    fun checkUpperCase(input:String) : Boolean {
        if(input.isEmpty()) {
            return false
        }
        if(input.contains("[a-z]+".toRegex())){
            return false
        }
        return true
    }
}