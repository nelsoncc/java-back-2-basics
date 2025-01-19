package generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private String littlePreference;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }
    int walkDistancePreference;

    @Override
    public void eat() {
        System.out.println("I'm a Cat eating");
    }
}
