package sem2.n4.z12;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void load(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
            System.out.println("loaded");
        } else {
            System.out.println("no saves");
        }
    }
}
