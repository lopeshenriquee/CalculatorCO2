package lopes.henrique.CONTROLLER;

import lopes.henrique.MODEL.Energy;
import lopes.henrique.MODEL.Food;
import lopes.henrique.MODEL.Transport;

public class CarbonCalculatorController {
    public double calculatorTotalCarbon(double energyConsumption, double distance, double efficiency, String fuelType, int diet){
        double carbonEnergy = Energy.calculateEnergyCarbon(energyConsumption);
        System.out.println(carbonEnergy);
        double carbonTransport = Transport.calculateTransportCarbon(distance, efficiency, fuelType);
        System.out.println(carbonTransport);
        double carbonFood = Food.calculateFoodCarbon(diet);
        System.out.println(carbonFood);


        return carbonEnergy + carbonTransport + carbonFood;
    }
}
