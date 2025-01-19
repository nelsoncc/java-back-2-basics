package generics;

public class GenericsExample {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(5.9);
        doublePrinter.print();
        StringPrinter stringPrinter = new StringPrinter("String to print");
        stringPrinter.print();

        GenericPrinter<Integer> intGenericPrinter = new GenericPrinter<>(5);
        intGenericPrinter.print();
        GenericPrinter<Double> doubleGenericPrinter = new GenericPrinter<>(5.9);
        doubleGenericPrinter.print();
        GenericPrinter<String> strGenericPrinter = new GenericPrinter<>("String to print generic");
        strGenericPrinter.print();


        //
        AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(new Dog());
        dogAnimalPrinter.print();
        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(new Cat());
        catAnimalPrinter.print();
    }
}
