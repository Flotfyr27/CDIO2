public class Die {
    //use this perhaps: private static SecureRandom random = new SecureRandom(); is more random than other methods.

    private int faceValue;
    private int dieFaces;

    public Die(int dieFaces){
        this.dieFaces = dieFaces;
        RollDie();
    }

    public int RollDie(){
        faceValue = (int) ((Math.random() * dieFaces) + 1);
        return faceValue;
    }

    public int GetFaceValue(){
        return faceValue;
    }
}


