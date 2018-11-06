import GameGUI.GUI_monopoly;

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
        GUI_monopoly gui = new GUI_monopoly(numberOfPlayers);
    }

    private Player[] CreatePlayers(int numberOfPlayers){
        Player[] players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
        }
        return players;
    }

    //The game loop. is active as long as no player has won
    public void gameLoop(){

        do{

        } while (!CheckForWin(players));
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
