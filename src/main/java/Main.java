import com.sun.deploy.util.Waiter;
import javafx.beans.binding.When;

import javax.sound.midi.Soundbank;
import java.sql.Time;
import GameGUI.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2);
        GUI_monopoly gui = new GUI_monopoly(2);
        //The game loop. is active as long as no player has won
        do{

        } while (!game.CheckForWin(game.players));
    }

}
