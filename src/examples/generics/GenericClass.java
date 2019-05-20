package examples.generics;

import java.util.ArrayList;

class GenericClass <T> {
    private T element;

    GenericClass(T element)
    {
        this.element = element;
    }

    T getElement()
    {
        return element;
    }

    static <T> void show(ArrayList<T> array)
    {
        array.forEach(element -> System.out.print(element + " "));
    }
}
