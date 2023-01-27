package HomeWork6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException{


        File fileOriginal = new File("C:\\Users\\quali\\IdeaProjects\\HomeWork\\src\\HomeWork6\\FileTask2.txt");
        File fileResult = new File("C:\\Users\\quali\\IdeaProjects\\HomeWork\\src\\HomeWork6\\result.txt");



        if (!fileResult.exists()) {
            try {
                fileResult.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try (Scanner scanner = new Scanner(fileOriginal);
             FileWriter fileWriter = new FileWriter(fileResult);) {
            StringBuilder line = new StringBuilder();
            while (scanner.hasNext()) {
                line.append(scanner.nextLine());
            }
            line = new StringBuilder(line.toString().replaceAll("\\s", ""));
            fileWriter.write(line.toString());
            fileWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


