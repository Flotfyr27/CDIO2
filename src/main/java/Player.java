public class Player{

    private Roll roll = new Roll();
    //It's the same for all the players, that's why we use static.
    private static int numberOfPlayers = 0;
    final String NAME;

    private int score;
    private boolean won;
    private Roll lastRoll;

    private String rollLog;

// using switch statement to AddScore

    public void main() {
        int roll = lastRoll.GetAddedScore();
        String scoreString;
        switch (score) {
            case 1: scoreString = "invalid number";
                break;
            case 2: scoreString = "Tower + 250";
                 score += 250;
                break;
            case 3: scoreString = "Crater -100";
                score -= 100;
                break;
            case 4: scoreString = "Palace gates + 100";
                score += 100;
                break;
            case 5: scoreString = "Cold Desert -20";
                score -= 20;
                break;
            case 6: scoreString = "Walled city +180";
                score += 180;
                break;
            case 7: scoreString = "Monastry 0";
                score += 0;
                break;
            case 8: scoreString = "Black cave -70";
                score -= 70;
                break;
            case 9: scoreString = "Huts in the mountain +60";
                score += 60;
                break;
            case 10: scoreString = "The Werewall (werewolf-wall -80) bonustur";
                score -= 70;
                break;
            case 11: scoreString = "The pit -50";
                score -= 50;
                break;
            case 12: scoreString = "Goldmine +650";
                score += 650;
                break;
        }
    }



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







