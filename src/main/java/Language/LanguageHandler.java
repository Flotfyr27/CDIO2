package Language;

import Language.FileManipulator;

import java.io.IOException;

public class LanguageHandler {
    private FileManipulator fileManipulator;
    private String languageFilePath;
    private String[] messages;

    public LanguageHandler(String language) {
        languageFilePath = ".\\Language\\" + language + ".txt";
        try {
            fileManipulator = new FileManipulator(languageFilePath);
            messages = fileManipulator.readFileToArr();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String[] getMessages() {
        return messages;
    }

    public void setLanguage(String language){
        languageFilePath = ".\\Language\\" + language + ".txt";
        fileManipulator.setFilePath(languageFilePath);
        try {
            messages = fileManipulator.readFileToArr();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

