package dz.anpt.myformrecyclerview.data

import dz.anpt.myformrecyclerview.R
import dz.anpt.myformrecyclerview.model.User

class ListUsers {

    fun loadUsers(): List<User> {
        return listOf<User>(
            User("Mohamed", 34),
            User("Omar", 66),
            User("Ali", 4),
            User("Houda", 43),
            User("Ismail", 55),

            )
    }
}