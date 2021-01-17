package by.bzmp.swat.HomeWorkJavaCollections.domain;

public class Car {

    private String model;

    private int carCost;

    private int fuelConsumption;

    private int vehicleSpeed;

    private TypesOfCars typeOfCar;

    public Car(String model, int carCost, int fuelConsumption, int vehicleSpeed, TypesOfCars typeOfCar) {
        this.model = model;
        this.carCost = carCost;
        this.fuelConsumption = fuelConsumption;
        this.vehicleSpeed = vehicleSpeed;
        this.typeOfCar = typeOfCar;
    }

    public TypesOfCars getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypesOfCars typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(int vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carCost=" + carCost +
                ", fuelConsumption=" + fuelConsumption +
                ", vehicleSpeed=" + vehicleSpeed +
                ", typeOfCar=" + typeOfCar +
                '}';
    }
}

