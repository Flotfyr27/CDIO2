public class Player {

    private Roll roll = new Roll();
    //It's the same for all the players, that's why we use static.
    private static int numberOfPlayers = 0;
    public String NAME;
    Account account = new Account();


// using switch statement to add the score to player

    public void main() {
        roll.RollDice();
        int result = roll.GetAddedScore();
        String besked;
        switch (result) {
            case 1:
                String besked1 = "invalid number";
                break;
            case 2:
                String besked2 = "Tower +250";
                account.changeScore(250);
                break;
            case 3:
                String besked3 = "Crater -100";
                account.changeScore(-100);
                break;
            case 4:
                String besked4 = "Palace gates +100";
                account.changeScore(100);
                break;
            case 5:
                String besked5 = "Cold Desert -20";
                account.changeScore(-20);
                break;
            case 6:
                String besked6 = "Walled city +180";
                account.changeScore(180);
                break;
            case 7:
                String besked7 = "Monastry 0";
                account.changeScore(0);
                break;
            case 8:
                String besked8 = "Black cave -70";
                account.changeScore(-70);
                break;
            case 9:
                String besked9 = "Huts in the mountain +60";
                account.changeScore(60);
                break;
            case 10:
                String besked10 = "The Werewall (werewolf-wall -80) bonustur";
                account.changeScore(-80);
                main();
                break;
            case 11:
                String besked11 = "The pit -50";
                account.changeScore(-50);
                break;
            case 12:
                String besked12 = "Goldmine +650";
                account.changeScore(650);
                break;
        }
    }

    //Checking if a player was won or not.
    public boolean CheckWin() {
        if (account.getScore() >= 3000)
            return true;
        else
            return false;
    }

}







