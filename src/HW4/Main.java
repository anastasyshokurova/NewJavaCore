package HW4;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Cat", "Dog", "Monkey", "Frog", "Bear", "Bird", "Cat", "Cat", "Monkey"};

        HashMap<String, Integer> word = new HashMap<>();
        for (
                String string : strings) {
            int n = word.getOrDefault(string, 0);
            word.put(string, ++n);
        }
        System.out.println("Даны слова:" + Arrays.toString(strings));
        System.out.println("Количество употребляемых слов:" + word);
    }
}