/**
 * This is the main class of the game. this class controls which player can act, and when the game is running.
 */
//import gui_main.gui;

public class Game {
    int numberOfPlayers;
    Player[] players;

    public Game(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
        players = CreatePlayers(numberOfPlayers);
    }
    private Player[] CreatePlayers(int numberOfPlayers){
        Player[] players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
        }
        return players;
    }

    public void gameLoop(){

    }

   //A function which checks all players for having won
    public boolean CheckForWin(Player[] players){
        for (Player player : players) {
            if (player.GetWon())
                return true;
        }
        return false;
    }
}
