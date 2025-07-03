package se.lofmark;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public int getId() {
        return id;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null ) {

        }
    }

}
