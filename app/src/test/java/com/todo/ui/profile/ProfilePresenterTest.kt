package com.todo.ui.profile

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.doNothing
import org.mockito.Mockito.times
import org.mockito.Spy
import org.mockito.junit.MockitoJUnitRunner
import java.io.IOException

@RunWith(MockitoJUnitRunner::class)
class ProfilePresenterTest {
    @Mock
    private lateinit var view: ProfileContract.View

    @Spy
    private var presenter: ProfilePresenter = ProfilePresenter()

    @Before
    fun setUp() {
        doNothing().when(presenter)
        //presenter.attach(view)
    }

    @Test
    fun `test_fetchProfileName_calles_onProfileNameReceived_on_positive_response`() {

        Mockito.`when`(presenter.fetchProfileNameFromRepository()).thenReturn("Gil Goldzweig")

        presenter.fetchProfileName()

        Mockito.verify(view, times(1))
            .onProfileNameReceived("Gil Goldzweig")
    }

    // (expected = MockitoException::class)
    @Test
    fun `test_fetchProfileName_calles_onProfileRequestFailed_on_exception`() {

       // val fakeException = Mockito.mock(IOException::class.java)
//        val fakeException = IOException()
        Mockito.`when`(presenter.fetchProfileNameFromRepository()).thenThrow(IOException::class.java)

        presenter.fetchProfileName()

        Mockito.verify(view, times(1))
            .onProfileNameRequestFailed(Mockito.mock(IOException::class.java))
    }
}