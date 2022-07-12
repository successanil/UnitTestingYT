package com.androiddevs.unittestingyt

object LoginUtil {



    data class User(val username: String,val password: String) {
        override fun equals(other: Any?): Boolean {
            return username == (other as User).username
        }
    }

    private val existingUsers = mapOf(
        "anil" to "123",
        "sunil" to "1234",
        "akhilesh" to "12345"
    )

    /*
      -- username shouldn't be empty
      -- password shouldn't be empty
      -- username shouldn't contain any special character
      -- password shouldn't have less than 3 characters
     */

    fun validateLoginInput(username:String,password:String) : Boolean {
        if(username.isEmpty()) {
            return false
        }

        if(password.isEmpty()) {
            return false
        }

        if(!username.contains("^[A-Za-z0-9_]+\$".toRegex())) {
            return false
        }
        if(existingUsers.get(username) != password) {
            return false
        }

        return true
    }

}