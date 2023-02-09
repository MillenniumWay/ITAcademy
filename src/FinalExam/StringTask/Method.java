package FinalExam.StringTask;
import java.util.Scanner;
public class Method {

    public void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку");
        String input = scanner.nextLine();
        char[] inpArray = input.toCharArray();
        int count = 1;
        for (int i = 0; i < input.length()-1;i++) {
            if (inpArray[i] == inpArray[i + 1]) count++;
            else  {
                System.out.print(inpArray[i] + "" + count);
                count = 1;
            }
        }
        System.out.print(input.charAt(input.length() - 1) + "" + count);
    }

}
