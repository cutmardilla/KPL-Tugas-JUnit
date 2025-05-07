
package com.example.simpletodo

import com.example.simpletodo.util.TodoManager
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TodoManagerTest {

    private lateinit var todoManager: TodoManager

    @Before
    fun setup() {
        todoManager = TodoManager()
    }

    @Test
    fun testAddTodo() {
        /* Test case: Tambahkan tugas dan pastikan jumlahnya bertambah */
        todoManager.addTodo("Kerjakan PR")
        assertEquals(1, todoManager.getTodos().size)
    }

    @Test
    fun testMarkTodoDone() {
        /* Test case: Tandai tugas pertama sebagai selesai dan cek statusnya */
        todoManager.addTodo("Beli sayur")
        todoManager.markDone(0)
        assertTrue(todoManager.getTodos()[0].isDone)
    }
}
