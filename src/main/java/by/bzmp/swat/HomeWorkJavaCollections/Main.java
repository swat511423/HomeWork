package by.bzmp.swat.HomeWorkJavaCollections;

import by.bzmp.swat.HomeWorkJavaCollections.domain.TaxiStation;
import by.bzmp.swat.HomeWorkJavaCollections.service.TaxiStationService;

// 10.Таксопарк. Определить иерархию легковых автомобилей.
//Создать таксопарк. Подсчитать стоимость автопарка.
//Провести сортировку автомобилей парка по расходу топлива.
//Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.

public class Main {

    public static void main(String[] args) {

        TaxiStation taxiStation = new TaxiStation();

        TaxiStationService taxiStationService = new TaxiStationService();
        taxiStationService.fillStation(taxiStation);

        System.out.println(" Стоимость автопарка USD " + taxiStation.getSumOfCarCost());
        System.out.println(" Транспортное средство соответствующее заданному параметру скорости " + taxiStation.sortByVehicleSpeed(220));
        System.out.println(" Сортировка автомобилей по расходу топлива" + taxiStation
                .sortByFuelConsumption()
                .toString());
    }
}
