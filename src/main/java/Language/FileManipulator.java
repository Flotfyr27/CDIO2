package Language;

import java.io.*;
import java.util.List;

public class FileManipulator {
    String filePath;
    BufferedWriter writer;
    BufferedReader reader;


    public FileManipulator(String filePath) throws IOException {
        this.filePath = filePath;
        writer = new BufferedWriter(new FileWriter(filePath, true));
        reader = new BufferedReader(new FileReader(filePath));
    }

    public void writeOverFile(String message) throws IOException {
        writer.write(message);
        writer.close();
    }

    public void appendToFile(String message) throws IOException {
        writer.write(message);
        writer.close();
    }

    public void readFileToSout(String filePath) throws IOException {
        String currentLine = reader.readLine();
        while (currentLine != null) {
            System.out.println(currentLine);
            currentLine = reader.readLine();
        }
        reader.close();
    }

    public String[] readFileToArr() throws IOException {
        String[] messages = new String[getMessageNum(filePath)];
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String currentLine = reader.readLine();
        int i = 0;
        while (currentLine != null) {
            messages[i++] = currentLine;
            currentLine = reader.readLine();
        }
        reader.close();
        return messages;
    }

    public int getMessageNum(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String currentLine = reader.readLine();
        int i = 0;
        while (currentLine != null) {
            i++;
            currentLine = reader.readLine();
        }
        return i;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
