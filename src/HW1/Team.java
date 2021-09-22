package HW1;
public class Team {
    private String name;
    private Player[] players = new Player[4];

    public Team (String name, Player[] players) {
        this.name = name;
        for (int i=0; i<4; i++) {
            if (i < players.length) this.players[i] = players[i];
            else this.players[i] = new Player("noname", 0);
        }
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String toString() {
        String str = "";
        for(Player player : players) {
            str += player.getName() + "-" + player.getEnergy() + " ";
        }
        return "Команда: \""+ name + "\", вид и характеристики: " + str;
    }
    public void showResults () {
        System.out.println("Успешно преодолели полосу препятствий:");
        for (Player player: players) {
            if (player.isWin()) System.out.println(player.getName());
        }
    }
}

