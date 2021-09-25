package HW3;
import java.util.Arrays;

public class GenericBox<T> {
    private T[] elements;

    public GenericBox(T...elements) {
        this.elements = elements;
    }
    public T[] getObj() {
        return elements;
    }
    public  void  replaceElements(int i10, int i5) {
        T tmp;
        tmp = this.elements[i10];
        this.elements[i10]=this.elements[i5];
        this.elements[i5]=tmp;
    }
    public String toString() {
        return Arrays.toString(elements);
    }
    public static void main (String[] args) {
        GenericBox<Integer> box = new GenericBox<>(5,10,15,20,25);
        System.out.println(box);
        box.replaceElements(1,2);
        System.out.println(box);
    }
}
