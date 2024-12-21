package org.knit.lab2.n5;

public class  File implements FileSystemComponent {
    private String name;
    private long size; // размер в байтах

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void add(FileSystemComponent component) {

    }

    @Override
    public void remove(FileSystemComponent component) {

    }


    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}