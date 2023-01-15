package com.todo.ui.profile


class ProfileContract : BaseContract {

    interface View : BaseContract.View {

        fun onProfileNameReceived(name: String)

        fun onProfileNameRequestFailed(exception: Exception)
    }

    interface Presenter : BaseContract.Presenter<View> {

        fun fetchProfileName()
    }
}