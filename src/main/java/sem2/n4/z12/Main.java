package sem2.n4.z12;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("hallo everynyan");
        Caretaker caretaker = new Caretaker();
        caretaker.saveState(editor);
        editor.Write("hai thanks you");
        System.out.println();
        caretaker.saveState(editor);
        editor.Write("o may gaaaah");
        System.out.println();
        caretaker.load(editor);
        System.out.println(editor.read());
        System.out.println();
        caretaker.load(editor);
        System.out.println(editor.read());
    }
}
