package lopes.henrique.MODEL;

public class CarbonResult {
    private double carbonEnergy;
    private double carbonTransport;
    private double carbonFood;
    private double totalCarbon;

    public CarbonResult(double carbonEnergy, double carbonTransport, double carbonFood, double totalCarbon) {
        this.carbonEnergy = carbonEnergy;
        this.carbonTransport = carbonTransport;
        this.carbonFood = carbonFood;
        this.totalCarbon = totalCarbon;
    }

    public double getCarbonEnergy() {
        return carbonEnergy;
    }

    public double getCarbonTransport() {
        return carbonTransport;
    }

    public double getCarbonFood() {
        return carbonFood;
    }

    public double getTotalCarbon() {
        return totalCarbon;
    }
}

