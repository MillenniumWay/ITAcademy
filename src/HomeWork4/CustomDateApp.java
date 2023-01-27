package HomeWork4;
import java.util.*;


    public class CustomDateApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дату в формате \"yyyy-mm-dd\"");
            String data = scanner.nextLine();
            while (!CustomDate.isValid(data)) {
                data = scanner.nextLine();
            }
            CustomDate customDate1 = new CustomDate(data);
            customDate1.isLeapYear();
            System.out.println(customDate1.dayOfTheWeek());

            System.out.println("Введите вторую дату в формате \"yyyy-mm-dd\"");
            String data2 = scanner.nextLine();
            while (!CustomDate.isValid(data2)) {
                data2 = scanner.nextLine();
            }
            CustomDate customDate2 = new CustomDate(data2);
            CustomDate.differenceDate(customDate1, customDate2);
            scanner.close();
        }
    }



