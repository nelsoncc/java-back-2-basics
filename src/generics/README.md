# Complete Guide to Java Generics

In this repository, the Generics package provides reusable, type-safe classes that can operate with any object type. Examples include:

- `StringPrinter`: A class for printing strings.
- `IntegerPrinter`: A class for printing integers.
- `DoublePrinter`: A class for printing doubles.
- `GenericPrinter<T>`: A generic class for printing any type of object.
- `AnimalPrinter<T extends Animal & Serializable>`: A generic class for printing animals that are serializable.

## Usage

The `GenericPrinter<T>` class can replace specific printer classes like `StringPrinter`, `IntegerPrinter`, and `DoublePrinter`. Here is an example:

```java
public class GenericsExample {

    public static void main(String[] args) {
        GenericPrinter<Integer> intGenericPrinter = new GenericPrinter<>(5);
        intGenericPrinter.print();
        GenericPrinter<Double> doubleGenericPrinter = new GenericPrinter<>(5.9);
        doubleGenericPrinter.print();
        GenericPrinter<String> strGenericPrinter = new GenericPrinter<>("String to print generic");
        strGenericPrinter.print();

        AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(new Dog());
        dogAnimalPrinter.print();
        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(new Cat());
        catAnimalPrinter.print();

        shout("John", 5);
        shout(555, "other");
        shout(5.55, 12);
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "! " + otherThingToShout + "!!");
    }
}
```
Generic containers for lists, stacks, queues, and more.
Utility classes for sorting and filtering objects in a type-safe manner.
