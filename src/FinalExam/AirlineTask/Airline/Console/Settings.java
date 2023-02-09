package FinalExam.AirlineTask.Airline.Console;

import FinalExam.AirlineTask.Airline.AirPlanes.Airplane;
import FinalExam.AirlineTask.Airline.AirLineCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Settings {

    public static void start(Scanner scan, AirLineCompany airLineCompany, ArrayList<Airplane> airplanes, ArrayList<Airplane> userChoice) {
        System.out.println("Доступные функции - 4 ");
        System.out.println("1 - Доступный самолеты для полета");
        System.out.println("2 - Общая вместительность и грузоподъемность ");
        System.out.println("3 - Поиск самолета по заданному параметру потребления горючего");
        System.out.println("4 - Добавленные самолеты в вашу коллекцию");
        System.out.println("Вы были перенаправлены в меню ");

        while (true) {
            int swit = scan.nextInt();

            switch (swit) {
                case 1 -> {
                    airLineCompany.AirPlanesForEach(airplanes);
                }

                case 2 -> {
                    airLineCompany.CapacityAndTounge(airplanes);
                }

                case 3 -> {
                    airLineCompany.UserFuel(airplanes,userChoice);
                }

                case 4-> {
                    airLineCompany.CollectUser(userChoice);
                }

                default -> {
                    System.out.println("Вы ввели что-то не то");
                }

            }
        }
    }
}
