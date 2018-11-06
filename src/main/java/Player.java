public class Player{

    private Roll roll = new Roll();
    //It's the same for all the players, that's why we use static.
    private static int numberOfPlayers = 0;
    final String NAME;

    private int score;
    private boolean won;
    private Roll lastRoll;

    private String rollLog;

// using switch statement to add the score to player

    public void main() {
        int roll = lastRoll.GetAddedScore();
        String besked;
        switch (roll) {
            case 1: String besked1= "invalid number";
                break;
            case 2: String besked2= "Tower + 250";
                 score += 250;
                break;
            case 3: String besked3 = "Crater -100";
                score -= 100;
                break;
            case 4: String besked4 = "Palace gates + 100";
                score += 100;
                break;
            case 5: String besked5= "Cold Desert -20";
                score -= 20;
                break;
            case 6: String besked6= "Walled city +180";
                score += 180;
                break;
            case 7: String besked7= "Monastry 0";
                score += 0;
                break;
            case 8: String besked8= "Black cave -70";
                score -= 70;
                break;
            case 9: String besked9= "Huts in the mountain +60";
                score += 60;
                break;
            case 10: String besked10= "The Werewall (werewolf-wall -80) bonustur";
                score -= 70;
                break;
            case 11: String besked11= "The pit -50";
                score -= 50;
                break;
            case 12: String besked12= "Goldmine +650";
                score += 650;
                break;
        }
    }


//player start score set to 1000
    public Player(){
        won = false;
        score = 1000;
        NAME = "Player " + ++numberOfPlayers;
        rollLog = "";
        lastRoll = roll;
    }


    public boolean GetWon(){
        return won;
    }
//Checking if a player was won or not.
    public boolean CheckWin(){
        if (score >= 3000)
            return true;
        else
            return false;
    }

    public String getRollLog() {
        return rollLog;
    }

    public void setRollLog(String rollLog) {
        this.rollLog = rollLog;
    }

    public int getScore() {
        return score;
    }
}







