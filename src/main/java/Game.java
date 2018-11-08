import GameGUI.GUI_monopoly;

/**
 * This is the main class of the game. this class controls which player can act, and when the game is running.
 */

public class Game {
    int numberOfPlayers;
    Player[] players;
    int currentPlayerIndex;

    public Game(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
        players = CreatePlayers(numberOfPlayers);
        currentPlayerIndex = 0;
        startGame();
    }

    private Player[] CreatePlayers(int numberOfPlayers){
        Player[] players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
        }
        return players;
    }

    //a function to start the game loop
    public void startGame(){
        gameLoop();
    }


    //The game loop. is active as long as no player has won
    private void gameLoop(){
        GUI_monopoly gui = new GUI_monopoly();

        do{
            gui.checkForRoll();
            gui.clearPlayerCars();

            players[currentPlayerIndex].main();
            gui.changeDiceValue(players[currentPlayerIndex].getDie_one(), players[currentPlayerIndex].getDie_two());
            gui.movePlayer(players[currentPlayerIndex].getPlayerRoll(),
                    gui.getPlayer(currentPlayerIndex+1));



            gui.setPlayerBalance(gui.getPlayer(currentPlayerIndex+1),
                    players[currentPlayerIndex].account.getScore() );


            if (players[currentPlayerIndex].CheckWin()) {
                System.out.println("Player " + (currentPlayerIndex + 1) + " won!");
            }

            nextPlayer();
        } while (!CheckForWin(players));
    }

    //A function to switch players without going out of bounds in the array and to loop through it indefinitely.
    public void nextPlayer(){
        if (currentPlayerIndex == players.length - 1){
            currentPlayerIndex = 0;
        } else {
            currentPlayerIndex++;
        }
    }

   //A function which checks all players for having won
    public boolean CheckForWin(Player[] players){
        for (Player player : players) {
            if (player.CheckWin())
                return true;
        }
        return false;
    }
}
