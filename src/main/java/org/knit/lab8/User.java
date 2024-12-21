package org.knit.lab8;

import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age + ", Email: " + email;
    }


}
