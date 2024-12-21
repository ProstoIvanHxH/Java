package org.knit.lab10;

class Pair<F, S> {
    private F first;
    private S second;

    // Конструктор
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class t18{
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setSecond(35);
        System.out.println(pair.getSecond());

    }
}