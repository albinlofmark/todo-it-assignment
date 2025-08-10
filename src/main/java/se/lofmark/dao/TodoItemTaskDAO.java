package se.lofmark.dao;

import se.lofmark.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {

    TodoItemTask persist (TodoItemTask todoItemTask);

    TodoItemTask findById(Integer id);

    List<TodoItemTask> findAll();

    List<TodoItemTask> findByAssignedStatus(boolean status);

    List<TodoItemTask> findByPersonId(Integer personId);

    void remove(Integer id);
}
