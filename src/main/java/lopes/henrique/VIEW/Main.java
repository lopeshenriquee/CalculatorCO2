package lopes.henrique.VIEW;

import lopes.henrique.CONTROLLER.CarbonCalculatorController;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarbonCalculatorController calculate = new CarbonCalculatorController();

        System.out.println("Digite o consumo mensal de energia (em kwh): ");
        double energyConsumption = scan.nextDouble();
        System.out.println("Digite a distância percorrida semanalmente de carro (em km): ");
        double distance = scan.nextDouble();
        System.out.println("Digite a eficiência do carro (km por litro): ");
        double efficiency = scan.nextDouble();
        System.out.println("Digite o tipo de combustível (gasolina ou alcool): ");
        String fuelType = scan.next();

        System.out.print("Escolha seu tipo de dieta: " +
                "\n1 - Carnívoro (Dieta com carne)" +
                "\n2 - Vegetariano (Dieta sem carne, mas com laticínios e ovos)" +
                "\n3 - Vegano (Dieta baseada em plantas, sem produtos de origem animal)"+
                "\nDigite a opção: " +
                "\n");
                int diet = scan.nextInt();

        double totalCarbon = calculate.calculatorTotalCarbon(energyConsumption, distance, efficiency, fuelType, diet);
        System.out.printf("\nSua Pegada de Carbono é estimada: %.2f toneladas de CO2 por ano.%n", totalCarbon);

        scan.close();
    }
}