package HomeWork6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        String path = "C:\\Users\\quali\\IdeaProjects\\HomeWork\\src\\HomeWork6\\FileTaskOne.txt";

        System.out.println("Вводите текст с клавиатуры. Программа остановит запись после слова \"stop\":");
        try (FileWriter writer = new FileWriter(path, false); Scanner scanner = new Scanner(System.in);) {
            while (true) {
                String text = scanner.nextLine();
                if (text.equals("stop")) {
                    break;
                } else {
                    writer.write(text + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
