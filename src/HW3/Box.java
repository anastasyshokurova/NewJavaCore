package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit>{
    ArrayList<T> box = new ArrayList();

    public Box(T...fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }
    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit (T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i=0; i < box.size(); i++) {
            totalWeight = totalWeight + box.get(i).getWeight();
        }
        return totalWeight;
    }

    public boolean compare (Box<? extends Fruit> boxWithSmth) {
        return Math.abs(getWeight() - boxWithSmth.getWeight()) < 0.0001f;
    }

    public void fruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }
}