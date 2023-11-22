package dz.anpt.myformrecyclerview.data

import dz.anpt.myformrecyclerview.R
import dz.anpt.myformrecyclerview.model.User

class ListUsers {

    fun loadUsers(): List<User> {
        return listOf<User>(
            User("Mohamed", R.drawable.img1, 43),
            User("Omar", R.drawable.img2, 54),
            User("Ali", R.drawable.img3, 32),
            User("Houda", R.drawable.img4, 22),
            User("Ismail", R.drawable.img1, 26),
            User("Youcef", R.drawable.img3, 33),

            )
    }
}