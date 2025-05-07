
package com.example.simpletodo.util

data class TodoItem(val description: String, var isDone: Boolean = false)

class TodoManager {
    private val todos = mutableListOf<TodoItem>()

    fun addTodo(description: String) {
        todos.add(TodoItem(description))
    }

    fun markDone(index: Int) {
        if (index in todos.indices) {
            todos[index].isDone = true
        }
    }

    fun getTodos(): List<TodoItem> = todos

    fun clearTodos() {
        todos.clear()
    }
}
