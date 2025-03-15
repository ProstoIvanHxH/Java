package sem2.n4.z12;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (history.isEmpty()) {
            return null;
        } else {
            return history.pop();
        }
    }
}
