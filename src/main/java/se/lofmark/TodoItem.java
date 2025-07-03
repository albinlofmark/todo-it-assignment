package se.lofmark;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    String title;
    String taskDescription;
    LocalDate deadLine;
    boolean done;
    Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadline() {
        return deadLine;
    }

    public Person getCreator() {
        return creator;
    }

    // Setters

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty:");
        }
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null || deadLine.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Deadline cannot be null or empty:");
        } else {
            this.deadLine = deadLine;
        }
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getSummary() {

        StringBuilder summary = new StringBuilder();

        summary.append("Todo Item Info -> ID: ").append(id)
                .append(", Title: ").append(title)
                .append(", Task description: ").append(taskDescription)
                .append(", Deadline: ").append(deadLine)
                .append(", Done: ").append(done)
                .append(", Creator: ").append(creator.getSummary());

        return summary.toString();
    }

    public boolean isOverdue() {
        if (LocalDate.now().isAfter(deadLine)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDone() {
        if (done) {
            return true;
        } else {
            return false;
        }
    }



}
