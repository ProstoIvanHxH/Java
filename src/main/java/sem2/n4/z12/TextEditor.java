package sem2.n4.z12;

public class TextEditor {

    private String text;

    public TextEditor(String s) {
        this.text =s;
    }
    public void Write(String s){
        text=text+'\n'+s;
        System.out.println(text);
    }
    public String read(){
        return text;
    }
    public Memento save(){
        return new Memento(text);
    }
    public void restore(Memento memento){
        this.text=memento.getText();
    }
}