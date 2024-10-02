package lopes.henrique.MODEL;

public class Energy {
    public static double calculateEnergyCarbon(double kWh) {
        double factor = 0.000817 ; // Emissões médias mês de CO2 por kwh
        return kWh * factor;
    }
}
