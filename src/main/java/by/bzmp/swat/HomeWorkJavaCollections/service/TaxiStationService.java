package by.bzmp.swat.HomeWorkJavaCollections.service;

import by.bzmp.swat.HomeWorkJavaCollections.domain.Car;
import by.bzmp.swat.HomeWorkJavaCollections.domain.TaxiStation;
import by.bzmp.swat.HomeWorkJavaCollections.domain.TypesOfCars;

public class TaxiStationService {

    public void fillStation(TaxiStation taxiStation){
        taxiStation.addCar(new Car("Volksvagen passat b6",
                6000, 10, 260, TypesOfCars.SEDAN));
        taxiStation.addCar(new Car("Geely Atlas",
                18000, 12, 220, TypesOfCars.CROSSOVER));
        taxiStation.addCar(new Car("Hyndai Solaris",
                9000, 7, 260, TypesOfCars.HATCHBACK));
        taxiStation.addCar(new Car("BMW X1",
                11000, 8, 270, TypesOfCars.HATCHBACK));
        taxiStation.addCar(new Car("Lada Vesta amt",
                11000, 8, 280, TypesOfCars.STATION_WAGON));
        taxiStation.addCar(new Car("Volkswagen Caravelle T5",
                12000, 14, 210, TypesOfCars.MINIVAN));
    }
}
