package com.todo.ui.profile

import com.todo.ui.BaseContract


class ProfileContract {

    interface View: BaseContract.View {

        fun onProfileNameReceived(name: String)

        fun onProfileNameRequestFailed(exception: Exception)
    }

    interface Presenter: BaseContract.Presenter<View> {

        fun fetchProfileName()
    }
}