package generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    int walkDistancePreference;

    @Override
    public void eat() {
        System.out.println("I'm a Dog eating");
    }
}
