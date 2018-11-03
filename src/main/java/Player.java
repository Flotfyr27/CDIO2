package spil;
public class Player {

        private static Roll roll = new Roll();
        private static int numberOfPlayers = 0;
        final String NAME;

        private int score;
        private boolean won;
        private Roll lastRoll;

        private String rollLog;

//* using switch statement to AddScore
        public void main() {
            int roll = score;
                String scoreString;
                switch (score) {
                    case1: scoreString = "invalid number";
                    break;
                    case2: scoreString = "Tower + 250";
                    score+=roll.GetAddedScore()=+250;
                    break;
                    case3: scoreString = "Crater -100";
                    score+=roll.GetAddedScore()=-100;
                    break;
                    case4: scoreString = "Palace gates + 100";
                    score+=roll.GetAddedScore()= +100;
                    break;
                    case5: scoreString = "Cold Desert -20";
                    score+=roll.GetAddedScore()=-20;
                    break;
                    case6: scoreString = "Walled city +180";
                    score+=roll.GetAddedScore()+180;
                    break;
                    case7: scoreString = "Monastry 0";
                    score+=roll.GetAddedScore()=0;
                    break;
                    case8: scoreString = "Black cave -70";
                    score+=roll.GetAddedScore()=-70
                    break;
                    case9: scoreString = "Huts in the mountain +60";
                    score+=roll.GetAddedScore()=+60;
                    break;
                    case10: scoreString = "The Werewall (werewolf-wall -80) bonustur";
                    score+=roll.GetAddedScore()=-70;
                    break;
                    case11: scoreString = "The pit -50";
                    score+=roll.GetAddedScore()=-50;
                    break;
                    case12: scoreString = "Goldmine +650";
                    score+=roll.GetAddedScore("");
                    break;
                }
            }


            lastRoll = roll;


        public Player(){
            won = false;
            score = 0;
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





