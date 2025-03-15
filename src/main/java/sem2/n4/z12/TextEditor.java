package sem2.n4.z12;

public class TextEditor {

    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text = this.text + '\n' + text;
    }

    public String getText() {
        return text;
    }

    public Memento saveStaate() {
        return new Memento(text);
    }

    public void restoreState(Memento memento) {
        this.text = memento.getSavedText();

    }

    @Override
    public String toString() {
        return text;
    }
}