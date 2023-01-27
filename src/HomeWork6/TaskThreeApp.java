package HomeWork6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TaskThreeApp {
        public static void main(String[] args) {

            ArrayList<TaskThreeUser> users = new ArrayList<>();


            users.add(new TaskThreeUser("Carl", 22));
            users.add(new TaskThreeUser("Felix", 25));
            users.add(new TaskThreeUser("Andrew", 41));

            File dir = new File("C:\\Users\\quali\\IdeaProjects\\HomeWork\\src\\HomeWork6\\TaskThreeUsers.txt");

            if (!dir.exists()) {
                dir.mkdir();
            }

            for (TaskThreeUser user : users) {
                File outputFile = new File(dir, user.getName());
                if (!outputFile.exists()) {
                    try {
                        outputFile.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                try (ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                    oos.writeObject(user);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }

            }
        }
    }
