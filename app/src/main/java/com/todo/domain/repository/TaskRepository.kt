package com.todo.domain.repository

import com.todo.domain.Task


interface TaskRepository {
    suspend fun getTasks(): List<Task>

    suspend fun updateTask(task: Task): Task

    suspend fun findTask(id: String): Task

    suspend fun deleteTask(id: String)

    suspend fun createTask(task: Task): Task
}