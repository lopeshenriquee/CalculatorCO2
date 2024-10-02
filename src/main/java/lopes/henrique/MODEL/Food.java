package lopes.henrique.MODEL;

public class Food {
    public static double calculateFoodCarbon(int dietType) {
        return switch (dietType) {
            case 1 -> 2.5;  // Carnívoro
            case 2 -> 1.7;  // Vegetariano
            case 3 -> 1.5;  // Vegano
            default -> 2.5;  // Padrão
        };
    }
}
