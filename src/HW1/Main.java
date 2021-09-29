package HW1;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[4];
        players[0] = new Player("Гепард", 105);
        players[1] = new Player("Лев", 98);
        players[2] = new Player("Леопард", 80);
        players[3] = new Player("Тигр", 75);

        Team team = new Team("Дикие кошки", players);
        System.out.println(team);

        int[] pits = {10,20,30,11,19};
        Course course = new Course(pits);
        System.out.println("Препятствия" + course);

        course.doIt(team);
        team.showResults();
    }
}