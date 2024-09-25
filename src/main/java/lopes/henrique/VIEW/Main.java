package lopes.henrique.VIEW;

import lopes.henrique.CONTROLLER.CarbonCalculatorController;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarbonCalculatorController calculate = new CarbonCalculatorController();

        System.out.println("Digite o consumo mensal de em energia (em kwh): ");
        double energyConsumption = scan.nextDouble();

        System.out.println("Digite a distância percorrida semanalmente de carro (em km): ");
        double distance = scan.nextDouble();
        System.out.println("Digite a eficiência do carro (km por litro): ");
        double efficiency = scan.nextDouble();
        System.out.println("Digite o tipo de combustível (gasolina ou alcool): ");
        String fuelType = scan.next();

        System.out.print("Escolha seu tipo de dieta: " + "1 - Carnívoro (Dieta com carne)" + "2 - Vegetariano (Dieta sem carne, mas com laticínios e ovos)" + "3 - Vegano (Dieta baseada em plantas, sem produtos de origem animal)");
        int diet = scan.nextInt();

        double totalCarbon = calculate.calculatorTotalCarbon(energyConsumption, distance, efficiency, fuelType, diet);
        System.out.printf("Sua Pegada de Carbono é estimada: %.2f toneladas de CO2 por ano.%n", totalCarbon);

        scan.close();
    }
}