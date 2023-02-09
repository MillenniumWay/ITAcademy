package FinalExam.AirlineTask.Airline;

import FinalExam.AirlineTask.Airline.AirPlanes.Airplane;


import java.util.*;

public class AirLineCompany {
    // Коллекция объектов Авиаокомпании
    private ArrayList<Airplane> airplanes;
    // Коллекция объетов пользователя
    private ArrayList<Airplane> userChoice;

 public static final Comparator<Airplane> AIRPLANE_COMPARATOR = new Comparator<Airplane>() {
     @Override
     public int compare(Airplane o1, Airplane o2) {
         return (int) (o1.getFlyingRange() - o2.getFlyingRange());
     }
 };

    // Вывод объектов колецкии

    public void AirPlanesForEach(ArrayList<Airplane> airplanes) {
        Collections.sort(airplanes, AIRPLANE_COMPARATOR);
        airplanes.stream().forEach(x -> System.out.println(x.toString()));
    }


    // Вывод общей грузоподъемности и вместительности всехсамолетов в колекции

    public void CapacityAndTounge(ArrayList<Airplane> airplanes) {

        double allCapacity = 0;
        int allTounage = 0;

        for (int i = 0; i < airplanes.size(); i++) {
            allCapacity = allCapacity + airplanes.get(i).getLoadCapacity();
        }
        for (int i = 0; i < airplanes.size(); i++) {
            allTounage = allTounage + airplanes.get(i).getTonnage();
        }

        System.out.println("All Capacity: " + allCapacity + " " + " All Tounge: " + allTounage);

    }

    // Подбор самолета ввиде кейса по параметру сжигаемого топлива
    // Добавление выбранного самолета в отдельную коллекцию для пользователя

    public void UserFuel(ArrayList<Airplane> airplanes, ArrayList<Airplane> userChoice) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберете параметр потребления горючего подходящий вам" + "\n" +
                "Программа подберет самолет подходящий параметру потребления горючего");


        System.out.println("1 - " + airplanes.get(0).getFuel() + "\n" +
                "2 - " + airplanes.get(1).getFuel() + "\n" +
                "3 - " + airplanes.get(2).getFuel() + "\n" +
                "4 - " + airplanes.get(3).getFuel() + "\n" +
                "5 - " + airplanes.get(4).getFuel() + "\n" +
                "6 - " + airplanes.get(5).getFuel() + "\n");


        int swit = scan.nextInt();

        System.out.println("Подходящий вам самолет - ");
        switch (swit) {
            case 1 -> {
                userChoice.add(airplanes.get(0));
                System.out.println("Самолеты в вашей новой колекции: ");
            }

            case 2 -> {
                userChoice.add(airplanes.get(1));
                System.out.println(airplanes.get(1).toString());
            }

            case 3 -> {
                userChoice.add(airplanes.get(2));
                System.out.println(airplanes.get(2).toString());
            }

            case 4 -> {
                userChoice.add(airplanes.get(3));
                System.out.println(airplanes.get(3).toString());
            }

            case 5 -> {
                userChoice.add(airplanes.get(4));
                System.out.println(airplanes.get(4).toString());
            }

            case 6 -> {
                userChoice.add(airplanes.get(5));
                System.out.println(airplanes.get(5).toString());
            }

            default -> {
                System.out.println("Вы ввели что-то не то");
            }
        }



    }

    // Вывод колекции объектов выбранных Пользователям

    public void CollectUser (ArrayList<Airplane> userChoice) {
        System.out.println("Выбранные вами самолеты : ");
        Collections.sort(userChoice, AIRPLANE_COMPARATOR);
        userChoice.stream().forEach(x-> System.out.println(x.toString()));
    }
}









