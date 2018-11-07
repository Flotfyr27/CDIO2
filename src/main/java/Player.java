public class Player {

    private Roll roll = new Roll();
    Account account = new Account();


// using switch statement to add the score to player

    public void main() {
        roll.RollDice();
        int result = roll.GetAddedScore();
        switch (result) {
            case 1:
                System.out.println("invalid number");
                break;
            case 2:
                account.changeScore(250);
                break;
            case 3:
                account.changeScore(-100);
                break;
            case 4:
                account.changeScore(100);
                break;
            case 5:
                account.changeScore(-20);
                break;
            case 6:
                account.changeScore(180);
                break;
            case 7:
                account.changeScore(0);
                break;
            case 8:
                account.changeScore(-70);
                break;
            case 9:
                account.changeScore(60);
                break;
            case 10:
                account.changeScore(-80);
                System.out.println("player got extra roll \n score: " + account.getScore());
                main();
                break;
            case 11:
                account.changeScore(-50);
                break;
            case 12:
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

    public int getPlayerRoll(){
        return roll.GetAddedScore();
    }

}







