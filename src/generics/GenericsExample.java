package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Non-generic class
        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(5.9);
        doublePrinter.print();
        StringPrinter stringPrinter = new StringPrinter("String to print");
        stringPrinter.print();

        // Generic class
        GenericPrinter<Integer> intGenericPrinter = new GenericPrinter<>(5);
        intGenericPrinter.print();
        GenericPrinter<Double> doubleGenericPrinter = new GenericPrinter<>(5.9);
        doubleGenericPrinter.print();
        GenericPrinter<String> strGenericPrinter = new GenericPrinter<>("String to print generic");
        strGenericPrinter.print();

        // Generic class with bounded type parameter
        AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(new Dog());
        dogAnimalPrinter.print();
        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(new Cat());
        catAnimalPrinter.print();

        // Multiple type parameters
        shout("John", 5);
        shout(555, "other");
        shout(5.55, 12);

        // Wildcards
//        List<Integer> intList = new ArrayList<>();
//        intList.add(3);
//        printList(intList);

        // Upper-bounded wildcard
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("kitty"));
        printList(catList);
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "! " + otherThingToShout + "!!");
    }

    private static void printList(List<? extends Animal> myList) {
        System.out.println(myList);
    }
}
