package lopes.henrique.MODEL;

public class Transport {
    public static double calculateTransportCarbon(double kmPerWeek, double efficiency, String fuelType) {
        double factor;

        if (fuelType.equalsIgnoreCase("gasolina")) {
            factor = 2.27; // 1 x 0,82, 0,75, 3,7 = Emissão de CO2 por litro de gasolina
        } else if (fuelType.equalsIgnoreCase("alcool")) {
            factor = 1.78; // Emissão de CO2 por litro de álcool
        } else {
            factor = 2.27; // Padrão para gasolina
        }

        //Multiplica pelo numero de semanas no ano e dps divide para chegar em toneladas
        return (kmPerWeek * 52 / efficiency) * factor / 1000;
    }
}
