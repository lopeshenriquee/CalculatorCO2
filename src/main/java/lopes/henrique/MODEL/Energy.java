package lopes.henrique.MODEL;

public class Energy {
    public static double calculateEnergyCarbon(double kWh) {
        double factor = 0.000233; // Emissões médias de CO2 por kWh
        return kWh * 12 * factor;
    }
}
