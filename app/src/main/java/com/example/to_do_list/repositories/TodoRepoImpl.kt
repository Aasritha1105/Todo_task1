package com.example.to_do_list.repositories

import com.example.to_do_list.database.TodoDatabase
import com.example.to_do_list.database.TodoEntity
import kotlinx.coroutines.flow.Flow


class TodoRepoImpl(private val database: TodoDatabase): TodoRepo {
    private val dao=database.todoDao()

    override suspend fun getTodos(): Flow<List<TodoEntity>> = dao.getTodos()
    override suspend fun addTodo(todo:TodoEntity) = dao.addTodo(todo)
    override suspend fun updateTodo(todo: TodoEntity) = dao.updateTodo(todo)
    override suspend fun deleteTodo(todo: TodoEntity) = dao.deleteTodo(todo)


}