package by.bzmp.swat.HomeWorkJavaCleanCode;

import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.militaryPlane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.PassengerPlane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.Plane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.models.MilitaryType;

import java.util.Arrays;
import java.util.List;

//В этом модуле есть одно большое задание.
//Вам необходимо исправить все ошибки в проекте aircompany.
//Сделайте копию проекта и постарайтесь отыскать и исправить все нарушения практик написания чистого кода.

public class Runner {

    static List<Plane> planes = Arrays.asList(
            new by.bzmp.swat.HomeWorkJavaCleanCode.Planes.PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new militaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new militaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new militaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new militaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new militaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new militaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
    );

    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlane());
        System.out.println("Military airport sorted by max distance: " + militaryAirport
                .sortByMaxDistance()
                .toString());
        System.out.println("Passenger airport sorted by max speed: " + passengerAirport
                .sortByMaxSpeed()
                .toString());

        System.out.println("Plane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());
    }
}