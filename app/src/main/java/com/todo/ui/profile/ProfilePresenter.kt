package ca.purple.foo.profile

import com.todo.ui.profile.ProfileContract
import java.io.IOException

open class ProfilePresenter : ProfileContract.Presenter {

    var view: ProfileContract.View? = null


    override fun attach(view: ProfileContract.View) {
        this.view = view
    }

    override fun detach() {
        view = null
    }

    override fun fetchProfileName() {

        val name: String

        try {
            name = fetchProfileNameFromRepository()
        } catch (io: IOException) {
            view?.onProfileNameRequestFailed(io)
            return
        }

        view?.onProfileNameReceived(name)
    }

    open fun fetchProfileNameFromRepository(): String {
        //Long operation that calls the repository and return the name or throws an exception

        return "Hello"
    }


}