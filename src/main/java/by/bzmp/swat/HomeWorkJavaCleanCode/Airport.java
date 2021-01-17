package by.bzmp.swat.HomeWorkJavaCleanCode;

import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.militaryPlane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.PassengerPlane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.Plane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.Planes.experimentalPlane;
import  by.bzmp.swat.HomeWorkJavaCleanCode.models.MilitaryType;

import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> planesList = this.planes;
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane instanceOfPassengerPlanes : planesList) {if (instanceOfPassengerPlanes instanceof PassengerPlane) {passengerPlanes.add((PassengerPlane) instanceOfPassengerPlanes);}}
        return passengerPlanes;
    }

    public List<militaryPlane> getMilitaryPlanes() {
        List<militaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof militaryPlane) {
                militaryPlanes.add((militaryPlane) plane);
            }
            else {

            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<militaryPlane> getTransportMilitaryPlanes() {
        List<militaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<militaryPlane> militaryPlanes = getMilitaryPlanes();
            for (int i = 0; i < militaryPlanes.size(); i++) {
                militaryPlane plane = militaryPlanes.get(i);
                 if (plane.getType() == MilitaryType.TRANSPORT) {
                    transportMilitaryPlanes.add(plane);
                 }
             }
    return transportMilitaryPlanes;
        }

    public List<militaryPlane> getBomberMilitaryPlanes() {
        List<militaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<militaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            militaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof experimentalPlane) {
                experimentalPlanes.add((experimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.GetMaxFlightDistance() - o2.GetMaxFlightDistance();
            }
        });
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
