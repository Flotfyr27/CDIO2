package GameGUI;

import Language.LanguageHandler;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import java.awt.*;

public class GUI_monopoly{
    private final int FIELD_SIZE = 12, LANGUAGE_LENGTH = 36;
    private String[] ENG = new String[LANGUAGE_LENGTH];
    private String[] RUS = new String[LANGUAGE_LENGTH];
    private String[] DAN = new String[LANGUAGE_LENGTH];
    private int playerTotal;
    String selectedLanguage = null;

    GUI_Field[] fields = new GUI_Field[FIELD_SIZE];
    public GUI_monopoly(int numberOfPlayers){
        playerTotal = numberOfPlayers;
        initGUI();
    }

    public void initGUI(){
            //Start
            GUI_Street Start = new GUI_Street();
            Start.setTitle("START");
            Start.setDescription("You start here...");
            Start.setSubText("");
            fields[0] = Start;

            //The Tower
            GUI_Street Tower = new GUI_Street("Tower", "+250", "You find a treasure of gold and silver!", "+250", Color.lightGray, null);
            fields[1] = Tower;
            //The Crater
            GUI_Street Crater = new GUI_Street("Crater", "-100", "You fall into a crater and must pay for repairs.", "-100", Color.lightGray, null);
            fields[2] = Crater;
            //Palace Gates
            GUI_Street PalaceGates = new GUI_Street("Palace gates", "+100", "You visit the Palace gates.", "+100", Color.lightGray, null);
            fields[3] = PalaceGates;
            //Cold Desert
            GUI_Street coldDesert = new GUI_Street("Cold Desert", "-20", "You enter a surprisingly cold desert. You feed the penguins.", "-20", Color.lightGray, null);
            fields[4] = coldDesert;
            //Walled city
            GUI_Street walledCity = new GUI_Street("Walled city", "+180", "You feel safe behind the city walls.", "+180", Color.lightGray, null);
            fields[5] = walledCity;
            //Monastery
            GUI_Street monastery = new GUI_Street("Monastery", "+0", "An inner peace finds your soul.", "+0", Color.lightGray, null);
            fields[6] = monastery;
            //Black cave
            GUI_Street blackCave = new GUI_Street("Black cave", "-70", "It's really dark, maybe you should light a torch?", "-70", Color.lightGray, null);
            fields[7] = blackCave;
            //Huts in the mountain
            GUI_Street mountainHut = new GUI_Street("Huts in the mountain", "+60", "This is nice I wonder who owns it.", "+60", Color.lightGray, null);
            fields[8] = mountainHut;
            //Werewall
            GUI_Street wereWall = new GUI_Street("The Werewall (Werewolf-wall)", "-80", "It's my wonderwall. +1 Free roll", "-80", Color.lightGray, null);
            fields[9] = wereWall;
            //The pit
            GUI_Street thePit = new GUI_Street("The pit", "-50", "Watch your step.", "-50", Color.lightGray, null);
            fields[10] = thePit;
            //Goldmine
            GUI_Street GoldMine = new GUI_Street("Goldmine", "+650", "You struck gold, run before any dwarves find you!", "+650", Color.lightGray, null);
            fields[11] = GoldMine;


        GUI gui = new GUI(fields, Color.WHITE);
        selectedLanguage = gui.getUserButtonPressed("\t\tEN/DK/RU", "Dansk", "English", "Русский");
        if(!selectedLanguage.equals(null)) {
            changeGUILanguage(selectedLanguage);
        }
    }

    //Saves data from language .txt file to respective array
    // Thereby changing the language in the process
    public void changeGUILanguage(String newLang){
        LanguageHandler LH = new LanguageHandler(newLang);
        LH.setLanguage(newLang);
        //Change value to english
        boolean Running = true;
        if(newLang.equals("English")) {
            ENG = LH.getMessages();
            fillFields(ENG);
            //Change values to danish
        }else if(newLang.equals("Dansk")){
            DAN = LH.getMessages();
            fillFields(DAN);
            //Change values to russian
        }else if(newLang.equals("Русский")){
            RUS = LH.getMessages();
            fillFields(RUS);
        }else {
            System.out.println("Language not supported");
        }
    }

//Method to actually change the values of the fields
    private void fillFields(String[] LANGUAGE){
        fields[0].setTitle(LANGUAGE[1]);
        fields[0].setDescription(LANGUAGE[2]);
        boolean Running = true;
        int lineNumber = 4, fieldNumber = 1;
        while(Running){
            fields[fieldNumber].setTitle(LANGUAGE[lineNumber]);
            fields[fieldNumber].setDescription(LANGUAGE[++lineNumber]);
            if(lineNumber < LANGUAGE_LENGTH-1){
                lineNumber++;
                if(lineNumber < LANGUAGE_LENGTH){
                    lineNumber++;
                }
            }
            if(fieldNumber < FIELD_SIZE-1) {
                fieldNumber++;
            }
            if(lineNumber == LANGUAGE_LENGTH-1){
                Running = false;
            }
        }
    }

}