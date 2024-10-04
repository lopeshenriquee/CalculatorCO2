package lopes.henrique.VIEW;

import lopes.henrique.MODEL.CarbonFootprintHistory;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        CarbonCalculatorController calculate = new CarbonCalculatorController();
//        try {
//            System.out.println("Digite o consumo mensal de energia (em kwh): ");
//            double energyConsumption = scan.nextDouble();
//
//            System.out.println("Digite a distância percorrida semanalmente de carro (em km): ");
//            double distance = scan.nextDouble();
//            System.out.println("Digite a eficiência do carro (km por litro): ");
//            double efficiency = scan.nextDouble();
//            System.out.println("Digite o tipo de combustível (gasolina ou alcool): ");
//            String fuelType = scan.next();
//
//            System.out.print("Escolha seu tipo de dieta: " +
//                    "\n1 - Carnívoro (Dieta com carne)" +
//                    "\n2 - Vegetariano (Dieta sem carne, mas com laticínios e ovos)" +
//                    "\n3 - Vegano (Dieta baseada em plantas, sem produtos de origem animal)" +
//                    "\nDigite a opção: " +
//                    "\n");
//            int diet = scan.nextInt();
//
//            double[] carbonValues = calculate.calculateCarbonValues(energyConsumption, distance, efficiency, fuelType, diet);
//
//            double totalCarbon = carbonValues[0];
//            double carbonEnergy = carbonValues[1];
//            double carbonTransport = carbonValues[2];
//            double carbonFood = carbonValues[3];
//
//            System.out.printf("\nSua Pegada de Carbono é estimada: %.2f toneladas de CO2 por ano.%n", totalCarbon);
//
//            Date calculationDate = Date.valueOf(LocalDate.now());
//
//            CarbonFootprintHistory history = new CarbonFootprintHistory(
//                    totalCarbon,
//                    carbonEnergy,
//                    carbonTransport,
//                    carbonFood,
//                    calculationDate
//            );
//
//            history.saveDatabase();
//        } catch (Exception e) {
//            System.err.println("Ocorreu um erro: " + e.getMessage());
//            e.printStackTrace(); // Exibe o stack trace para depuração
//        } finally {
//            scan.close(); // Garante que o scanner seja fechado, mesmo se ocorrer um erro
//        }
        showCarbonFootprintHistory();
    }

    private static void showCarbonFootprintHistory() {
        List<CarbonFootprintHistory> historyList = CarbonFootprintHistory.getHistory();

        System.out.println("\nHistórico de Pegada de Carbono:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (CarbonFootprintHistory record : historyList) {
            String formattedDate = record.getCalculationDate().toLocalDate().format(formatter);
            System.out.printf("ID: %d | Data: %s | Total: %.2f t CO2 | Energia: %.2f t CO2 | Transporte: %.2f t CO2 | Alimentação: %.2f t CO2%n",
                    record.getId(),
                    formattedDate,
                    record.getCarbonValue(),
                    record.getEnergyValue(),
                    record.getTransportValue(),
                    record.getFoodValue());
        }
    }
}
