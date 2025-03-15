package sem2.n4.z12;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        editor.setText("privetiki");
        System.out.println(editor);
        System.out.println();
        caretaker.saveState(editor.saveStaate());
        editor.addText("i hate you");
        System.out.println(editor);
        System.out.println();
        caretaker.saveState(editor.saveStaate());
        editor.setText("im blue");
        System.out.println(editor);
        System.out.println();
        Memento prevstate = caretaker.undo();
        editor.restoreState(prevstate);
        System.out.println(editor);
        System.out.println();
        prevstate=caretaker.undo();
        editor.restoreState(prevstate);
        System.out.println(editor);
    }
}
