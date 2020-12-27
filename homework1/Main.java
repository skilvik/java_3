package java_3.lesson1.homework1;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

//    я знаю, что скорее всего нужно было использовать Collections.copy(), но до меня не доходит как. :(

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }

    Orange orange = new Orange();
    Apple apple = new Apple();
    Box<Orange> orangeBox = new Box<Orange>(orange, orange);
    Box<Apple> appleBox = new Box<Apple>(apple, apple, apple);



}
