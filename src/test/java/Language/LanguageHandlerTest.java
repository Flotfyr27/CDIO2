package Language;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class LanguageHandlerTest {

    @Test
    void getMessages() {
        LanguageHandler languageHandler = new LanguageHandler("English");
        assertTrue(languageHandler.getMessages().getClass() == String[].class);
        assertTrue(languageHandler.getMessages()[0].equalsIgnoreCase("Hello there!"));

    }

    @Test
    void setLanguage() {
        LanguageHandler languageHandler = new LanguageHandler("English");
        assertTrue(languageHandler.getMessages().getClass() == String[].class);
        assertTrue(languageHandler.getMessages()[0].equalsIgnoreCase("Hello there!"));

        languageHandler.setLanguage("Danish");
        assertTrue(languageHandler.getMessages().getClass() == String[].class);
        assertTrue(languageHandler.getMessages()[0].equalsIgnoreCase("Hej du der!"));
    }
}