package examples.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> generic_integer = new GenericClass<>(5);
        System.out.println(generic_integer.getElement());
        GenericClass<String> generic_string = new GenericClass<>("This is a string");
        System.out.println(generic_string.getElement());

        ArrayList<String> string_array = new ArrayList<>(3);
        string_array.add("Hi");
        string_array.add("I'm");
        string_array.add("Juan");
        GenericClass.show(string_array);

        System.out.println();

        ArrayList<Integer> integer_array = new ArrayList<>(3);
        for (int i=0; i<3; i++) {
            integer_array.add(i);
        }
        GenericClass.show(integer_array);
    }
}
