package lopes.henrique.CONTROLLER;

import lopes.henrique.MODEL.Energy;
import lopes.henrique.MODEL.Food;
import lopes.henrique.MODEL.Transport;

import java.text.DecimalFormat;

public class CarbonCalculatorController {
    public double calculatorTotalCarbon(double energyConsumption, double distance, double efficiency, String fuelType, int diet){
        DecimalFormat df = new DecimalFormat("0.00");

        double carbonEnergy = Energy.calculateEnergyCarbon(energyConsumption);
        double carbonTransport = Transport.calculateTransportCarbon(distance, efficiency, fuelType);
        double carbonFood = Food.calculateFoodCarbon(diet);

        System.out.println("CO2 gerado por energia: " + df.format(carbonEnergy));
        System.out.println("CO2 gerado no transporte: " + df.format(carbonTransport));
        System.out.println("CO2 gerado na sua alimentação: " + df.format(carbonFood));

        return carbonEnergy + carbonTransport + carbonFood;
    }
}
