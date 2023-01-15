package com.todo.domain

data class Task(
    val _id: String = "",
    val title: String = "",
    val description: String = "",
    val isCompleted: Boolean = false) {

}
