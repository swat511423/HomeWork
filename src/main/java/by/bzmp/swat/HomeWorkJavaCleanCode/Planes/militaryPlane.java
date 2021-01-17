package by.bzmp.swat.HomeWorkJavaCleanCode.Planes;

import by.bzmp.swat.HomeWorkJavaCleanCode.models.MilitaryType;

import java.util.Objects;

public class militaryPlane extends Plane {

    private MilitaryType type;

    public militaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public void setType(MilitaryType type) {
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof militaryPlane)) return false;
        if (!super.equals(o)) return false;
        militaryPlane that = (militaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
