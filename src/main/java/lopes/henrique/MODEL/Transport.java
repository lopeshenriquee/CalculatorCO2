package lopes.henrique.MODEL;

public class Transport {
    public static double calculateTransportCarbon(double kmPerWeek, double efficiency, String fuelType) {
        double factor;

        if (fuelType.equalsIgnoreCase("gasolina")) {
            factor = 2.31; // Emissão de CO2 por litro de gasolina
        } else if (fuelType.equalsIgnoreCase("alcool")) {
            factor = 1.53; // Emissão de CO2 por litro de álcool
        } else {
            factor = 2.31; // Padrão para gasolina
        }

        return (kmPerWeek * 52 / efficiency) * factor / 1000;
    }
}
