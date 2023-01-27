package HomeWork4;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.regex.*;
import java.util.Scanner;

    public class CustomDate {
        public Year year;
        private Month month;
        private Day day;

        Scanner scanner = new Scanner(System.in);

        public CustomDate(String data) {
            this.year = new Year(Integer.parseInt(data.split("-")[0]));
            this.month = new Month(Integer.parseInt(data.split("-")[1]));
            this.day = new Day(Integer.parseInt(data.split("-")[2]));
        }



        public static boolean isValid(String data) {



            Pattern pattern = Pattern.compile("((19|20)\\d\\d)\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])");
            Matcher matcher = pattern.matcher(data);


            if (matcher.matches()) {
                System.out.println("Валидация формата даты пройдена.");
                return true;
            } else {
                System.out.println("Валидация формата даты не пройдена. Повторите ввод даты в формате \"yyyy-mm-dd\"");
                return false;
            }
        }

        public static void differenceDate(CustomDate customDate1, CustomDate customDate2) {
            LocalDateTime localDateTime1 = LocalDateTime.of(customDate1.getYear(), customDate1.getMonth(), customDate1.getDay(), 0, 0);
            LocalDateTime localDateTime2 = LocalDateTime.of(customDate2.getYear(), customDate2.getMonth(), customDate2.getDay(), 0, 0);
            long epohMinuten1 = localDateTime1.toEpochSecond(ZoneOffset.UTC);
            long epohMinuten2 = localDateTime2.toEpochSecond(ZoneOffset.UTC);
            long difDay = (Math.abs(epohMinuten1 - epohMinuten2)) / 86400;
            System.out.println("Разница между введенными датами составляет - " + difDay + " дней.");

        }

        public DaysOfWeek dayOfTheWeek() {
            LocalDate localDate = LocalDate.of(getYear(), getMonth(), getDay());
            DayOfWeek day = localDate.getDayOfWeek();
            int numberDay = day.getValue();
            switch (numberDay) {
                case 1:
                    return DaysOfWeek.MONDAY;
                case 2:
                    return DaysOfWeek.TUESDAY;
                case 3:
                    return DaysOfWeek.WEDNESDAY;
                case 4:
                    return DaysOfWeek.THURSDAY;
                case 5:
                    return DaysOfWeek.FRIDAY;
                case 6:
                    return DaysOfWeek.SATURDAY;
                case 7:
                    return DaysOfWeek.SUNDAY;
                default:
                    return null;
            }
        }

        public void isLeapYear() {
            if ((year.yearNumber % 4 == 0) && (year.yearNumber % 100 != 0) || (year.yearNumber % 400 == 0)) {
                System.out.println("Год - " + year.yearNumber + " високосный.");
            } else {
                System.out.println("Год - " + year.yearNumber + " не високосный.");
            }
        }

        public int getYear() {
            return year.yearNumber;
        }

        public int getMonth() {
            return month.monthNumber;
        }

        public int getDay() {
            return day.dayNumber;
        }

        private class Year {
            private int yearNumber;

            public Year(int data1) {
                yearNumber = data1;
            }
        }

        public class Month {
            private int monthNumber;

            public Month(int data2) {
                this.monthNumber = data2;
            }
        }

        public class Day {
            private int dayNumber;

            public Day(int data3) {
                this.dayNumber = data3;
            }
        }

    }


