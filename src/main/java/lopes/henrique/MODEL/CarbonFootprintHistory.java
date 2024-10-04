package lopes.henrique.MODEL;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class CarbonFootprintHistory {
    private int id;
    private double carbonValue;
    private double energyValue;
    private double transportValue;
    private double foodValue;
    private Date calculationDate;

    public CarbonFootprintHistory(int id, double carbonValue, double energyValue, double transportValue, double foodValue, Date calculationDate) {
        this.id = id;
        this.carbonValue = carbonValue;
        this.energyValue = energyValue;
        this.transportValue = transportValue;
        this.foodValue = foodValue;
        this.calculationDate = calculationDate;
    }

    public int getId() {
        return id;
    }

    public double getCarbonValue() {
        return carbonValue;
    }

    public double getEnergyValue() {
        return energyValue;
    }

    public double getTransportValue() {
        return transportValue;
    }

    public double getFoodValue() {
        return foodValue;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public void saveDatabase() {
        String query = "INSERT INTO carbonHistory (carbon_value, energy_value, transport_value, food_value, calculation_date) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setDouble(1, carbonValue);
            stmt.setDouble(2, energyValue);
            stmt.setDouble(3, transportValue);
            stmt.setDouble(4, foodValue);
            stmt.setDate(5, calculationDate);

            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1); // Atualiza o ID com o valor gerado pelo banco de dados
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<CarbonFootprintHistory> getHistory() {
        List<CarbonFootprintHistory> historyList = new ArrayList<>();
        String query = "SELECT * FROM carbonHistory";

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                double carbonValue = rs.getDouble("carbon_value");
                double energyValue = rs.getDouble("energy_value");
                double transportValue = rs.getDouble("transport_value");
                double foodValue = rs.getDouble("food_value");
                Date calculationDate = rs.getDate("calculation_date");

                historyList.add(new CarbonFootprintHistory(id, carbonValue, energyValue, transportValue, foodValue, calculationDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historyList;
    }
}
