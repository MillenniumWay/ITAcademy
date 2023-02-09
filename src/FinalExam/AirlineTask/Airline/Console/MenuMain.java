package FinalExam.AirlineTask.Airline.Console;
import FinalExam.AirlineTask.Airline.AirPlanes.AirBus.AirbusA220;
import FinalExam.AirlineTask.Airline.AirPlanes.AirBus.AirbusA320;
import FinalExam.AirlineTask.Airline.AirPlanes.AirBus.AirbusA330;
import FinalExam.AirlineTask.Airline.AirPlanes.Airplane;
import FinalExam.AirlineTask.Airline.AirPlanes.Boeing.Boeing717;
import FinalExam.AirlineTask.Airline.AirPlanes.Boeing.Boeing737;
import FinalExam.AirlineTask.Airline.AirPlanes.Boeing.Boeing747;
import FinalExam.AirlineTask.Airline.AirLineCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        ArrayList<Airplane> userChoice = new ArrayList<>();
        AirbusA220 airbusA220 = new AirbusA220("AirbusA220", 74, 35000,1200, 2.6,1);
        AirbusA320 airbusA320 = new AirbusA320("AirbusA320",86, 31000,1300, 3.2,2);
        AirbusA330 airbusA330 = new AirbusA330("AirbusA330",92, 31000, 1600, 3.5,3);
        Boeing717 boeing717 = new Boeing717("Boeing717",124, 49000, 2300, 5.6,4);
        Boeing737 boeing737 = new Boeing737("Boeing737",169, 56000, 2500, 6.1,5);
        Boeing747 boeing747 = new Boeing747("Boeing747",192, 63000, 3200, 6.7,6);
        airplanes.add(airbusA220);
        airplanes.add(airbusA320);
        airplanes.add(airbusA330);
        airplanes.add(boeing717);
        airplanes.add(boeing737);
        airplanes.add(boeing747);

        Scanner scanner = new Scanner(System.in);
        AirLineCompany airLineCompany = new AirLineCompany();

        Settings.start(scanner,airLineCompany,airplanes,userChoice);
    }
}
