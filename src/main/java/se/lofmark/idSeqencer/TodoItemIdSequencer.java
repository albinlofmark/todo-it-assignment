package se.lofmark.idSeqencer;

public class TodoItemIdSequencer {
    private int currentId = 0;

    private static final TodoItemIdSequencer INSTANCE = new TodoItemIdSequencer();

    private TodoItemIdSequencer() {}

    public static TodoItemIdSequencer getInstance() {
        return INSTANCE;
    }

    public int nextId() {
        return ++currentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID must be non-negative");
        }
        this.currentId = id;
    }


    public void reset() {
        currentId = 0;
    }
}
