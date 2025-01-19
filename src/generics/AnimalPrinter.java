package generics;

import java.io.Serializable;

public class AnimalPrinter<T extends Animal & Serializable> {
    private final T thingToPrint;

    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
