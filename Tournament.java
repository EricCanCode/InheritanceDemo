public class Tournament {
    public static void main(String[] args) {
        Player a = new Player();
        Game m = new Game();
        System.out.print("Game: " + m + a);
    }
}

class Game {
    private String game = "Mortal Kombat 4: ";
    public String toString() {return game;}
}

class Player extends Game {
    public String toString() {
        String playerA = "Player 1";
        String playerB = "Player 2";
        return "Tournament = " + playerA + " vs " + playerB;}
}


