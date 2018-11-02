package Language;

import java.io.*;
import java.util.List;

public class FileManipulator{


        public void writeOverFile(String fileName, String message) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(message);
            writer.close();
        }

        public void appendToFile(String fileName, String message) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(message);
            writer.close();
        }

        public void readFileToSout(String fileName) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            while (currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();
        }

        public String[] readFileToArr(String fileName, int messageNum) throws IOException {
            String[] messages = new String[messageNum];
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            int i=0;
            while (currentLine != null){
                messages[i++] = currentLine;
                currentLine = reader.readLine();
            }
            reader.close();
            return messages;
        }
}
