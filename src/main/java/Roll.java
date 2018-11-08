public class Roll {
    private int value1;
    private int value2;
    Die die = new Die();

    public Roll(){
        RollDice();
    }

    public void  RollDice(){
        value1 = die.RollDie();
        value2 = die.RollDie();
    }
    public int getValue1(){return value1;}

    public int getValue2(){return value2;}

    public int GetAddedScore(){
        return value1 + value2;
    }


    public String toString() {
        return "(" + value1 + ", " + value2 + ")";



    }
}
