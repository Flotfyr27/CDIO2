package GameGUI;

public class GUI_monopolyTest {
    public static void main(String[] args) {
        GUI_monopoly guiTest = new GUI_monopoly();
        guiTest.changeDiceValue(2,3);
        guiTest.movePlayer(5, guiTest.getPlayer(1));
    }
}
