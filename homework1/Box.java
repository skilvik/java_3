package java_3.lesson1.homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruits>{
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public double getWeight() {
        double weight = 0.0;
        for (T fruit: fruits) {
            weight = weight+fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruits> boxWithSomething) {
        return Math.abs(getWeight() - boxWithSomething.getWeight()) < 0.0001;
    }

    void shift(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }


}
