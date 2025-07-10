package com.austin.pizzaorder.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PizzaOrderController {

    @FXML
    private ComboBox<String> sizeComboBox;

    @FXML
    private CheckBox cheeseCheckBox, pepperoniCheckBox, mushroomCheckBox;

    @FXML
    private Label totalLabel;

    @FXML
    public void initialize() {
        sizeComboBox.getItems().addAll("Small", "Medium", "Large");
        sizeComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void placeOrder() {
        double total = 0.0;

        switch (sizeComboBox.getValue()) {
            case "Small" -> total += 8.0;
            case "Medium" -> total += 10.0;
            case "Large" -> total += 12.0;
        }

        if (cheeseCheckBox.isSelected()) total += 1.0;
        if (pepperoniCheckBox.isSelected()) total += 1.5;
        if (mushroomCheckBox.isSelected()) total += 1.0;

        totalLabel.setText(String.format("$%.2f", total));
    }
}

