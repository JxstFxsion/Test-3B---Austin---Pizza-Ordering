package com.austin.pizzaorder.dao;

import com.austin.pizzaorder.model.PizzaOrder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaOrderDAO {

    public void insertOrder(PizzaOrder order) {
        String sql = "INSERT INTO pizza_orders (customer_name, mobile_number, pizza_size, toppings_count, total_bill) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, order.getCustomerName());
            stmt.setString(2, order.getMobileNumber());
            stmt.setString(3, order.getPizzaSize());
            stmt.setInt(4, order.getToppingsCount());
            stmt.setDouble(5, order.getTotalBill());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PizzaOrder> getAllOrders() {
        List<PizzaOrder> orders = new ArrayList<>();
        String sql = "SELECT * FROM pizza_orders";

        try (Connection conn = DBConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                orders.add(new PizzaOrder(
                        rs.getInt("id"),
                        rs.getString("customer_name"),
                        rs.getString("mobile_number"),
                        rs.getString("pizza_size"),
                        rs.getInt("toppings_count"),
                        rs.getDouble("total_bill")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }

    public void updateOrder(PizzaOrder order) {
        String sql = "UPDATE pizza_orders SET customer_name=?, mobile_number=?, pizza_size=?, toppings_count=?, total_bill=? WHERE id=?";

        try (Connection conn = DBConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, order.getCustomerName());
            stmt.setString(2, order.getMobileNumber());
            stmt.setString(3, order.getPizzaSize());
            stmt.setInt(4, order.getToppingsCount());
            stmt.setDouble(5, order.getTotalBill());
            stmt.setInt(6, order.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteOrder(int id) {
        String sql = "DELETE FROM pizza_orders WHERE id=?";

        try (Connection conn = DBConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

