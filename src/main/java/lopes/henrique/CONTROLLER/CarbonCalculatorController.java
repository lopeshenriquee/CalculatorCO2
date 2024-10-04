package lopes.henrique.CONTROLLER;

import lopes.henrique.MODEL.CarbonResult;
import lopes.henrique.MODEL.Energy;
import lopes.henrique.MODEL.Food;
import lopes.henrique.MODEL.Transport;

import java.text.DecimalFormat;

public class CarbonCalculatorController {
    public double[] calculateCarbonValues(double energyConsumption, double distance, double efficiency, String fuelType, int diet){
        double carbonEnergy = Energy.calculateEnergyCarbon(energyConsumption);
        double carbonTransport = Transport.calculateTransportCarbon(distance, efficiency, fuelType);
        double carbonFood = Food.calculateFoodCarbon(diet);

        double totalCarbon = carbonEnergy + carbonTransport + carbonFood;

        return new double[]{totalCarbon, carbonEnergy, carbonTransport, carbonFood};
    }
}
