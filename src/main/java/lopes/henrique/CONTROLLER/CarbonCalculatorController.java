package lopes.henrique.CONTROLLER;

import lopes.henrique.MODEL.Energy;
import lopes.henrique.MODEL.Food;
import lopes.henrique.MODEL.Transport;

public class CarbonCalculatorController {
    public double calculatorTotalCarbon(double energyConsumption, double distance, double efficiency, String fuelType, int diet){
        double carbonEnergy = Energy.calculateEnergyCarbon(energyConsumption);
        double carbonTransport = Transport.calculateTransportCarbon(distance, efficiency, fuelType);
        double carbonFood = Food.calculateFoodCarbon(diet);

        return carbonEnergy + carbonTransport + carbonFood;
    }
}
