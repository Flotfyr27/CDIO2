import java.security.SecureRandom;
public class Die {
    //use this perhaps: private static SecureRandom random = new SecureRandom(); is more random than other methods.

    private int faceValue;

    public Die(){
        RollDie();
    }

    public int RollDie(){
        faceValue = (int) ((Math.random() * 6) + 1);
        return faceValue;
    }

    public int GetFaceValue(){
        return faceValue;
    }
}


