package by.bzmp.swat.HomeWorkJavaCollections.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiStation {
    private List<Car> carList = new ArrayList<Car>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> sortByVehicleSpeed(int speed) {
        List<Car> listByVehicleSpeed = new ArrayList<>();
        for (Car car : carList) {
            if (car.getVehicleSpeed() == speed) {
                listByVehicleSpeed.add(car);
            }
        }
        return listByVehicleSpeed;
    }

    public int getSumOfCarCost() {
        int carCost = 0;
        for (Car car : carList) {
            carCost += car.getCarCost();
        }
        return carCost;
    }

    public List<Car> sortByFuelConsumption() {
        List<Car> sortedByFuel = new ArrayList<>(carList);
        sortedByFuel.sort(Comparator.comparingInt(Car::getFuelConsumption));
        return sortedByFuel;
    }

    @Override
    public String toString() {
        return "TaxiStation{" +
                "carList=" + carList +
                '}';
    }

}






