package HW3;

public class Main {
    public static void main(String[] args) {
        boxesWhithFruits();
    }

    public static void boxesWhithFruits() {
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOrange = new Box<>(new Orange(), new Orange(), new Orange());
        Box<Orange> anotherBoxWithOrange = new Box<>();
        System.out.println("Коробка с яблоками весит" + boxWithApple.getWeight());
        System.out.println("Коробка с апельсинами весит" + boxWithOrange.getWeight());
        System.out.println(boxWithApple.compare(boxWithOrange));
        boxWithOrange.fruitsToAnotherBox(anotherBoxWithOrange);
        System.out.println(boxWithOrange.getBox());
        System.out.println(anotherBoxWithOrange.getBox());
    }
}
