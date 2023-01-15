package com.todo.data.api


import com.todo.domain.Task
import retrofit2.Call
import retrofit2.http.GET

interface TaskApi {
    @GET("tasks")
    fun getTasks(): Call<List<Task>>
}