package lopes.henrique.MODEL;

public class Food {
    public static double calculateFoodCarbon(int dietType) {
        return switch (dietType) {
            case 1 -> 1.8;  // Carnívoro
            case 2 -> 1.2;  // Vegetariano
            case 3 -> 0.8;  // Vegano
            default -> 1.5;  // Padrão
        };
    }
}
