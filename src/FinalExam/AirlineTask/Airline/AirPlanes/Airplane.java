package FinalExam.AirlineTask.Airline.AirPlanes;

public class Airplane {
    String model;
    int index;
    int tonnage;
    double loadCapacity;
    double flyingRange;
    double fuel;

    public double getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(double flyingRange) {
        this.flyingRange = flyingRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel  + " L/100 Miles";    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Airplane(String model, int toonnage, double loadCapacity, double flyingRange, double fuel, int index) {
        this.index = index;
        this.model = model;
        this.tonnage = toonnage;
        this.loadCapacity = loadCapacity;
        this.flyingRange = flyingRange;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return " Airplane model: " + "" + model + "  " + " Tonnage:"+ "  "+  tonnage + "  " + "Load Capacity:" + "  " + loadCapacity + "kg | "
                + "Flying Range: " + "  " + flyingRange + "Miles  " + "Fuel : " + fuel  +"L/100 Miles";
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public double allCapacity () {
        return loadCapacity;
    }

    public String fuel() {
        return "L / 100 Miles" + "For only one Person";
    }

}
