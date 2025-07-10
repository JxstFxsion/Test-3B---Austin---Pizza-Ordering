package com.austin.pizzaorder.test;

import com.austin.pizzaorder.util.BillCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BillCalculatorTest {

    @Test
    public void testSmallPizzaNoToppings() {
        double total = BillCalculator.calculateTotal("S", 0);
        assertEquals(9.20, total, 0.01); // 8 + 0 + 15% HST
    }

    @Test
    public void testMediumPizzaTwoToppings() {
        double total = BillCalculator.calculateTotal("M", 2);
        assertEquals(13.80, total, 0.01); // 10 + 3 + 15% HST
    }

    @Test
    public void testLargePizzaFiveToppings() {
        double total = BillCalculator.calculateTotal("L", 5);
        assertEquals(19.55, total, 0.01); // 12 + 7.5 + 15% HST
    }

    @Test
    public void testXLPizzaWithOneTopping() {
        double total = BillCalculator.calculateTotal("XL", 1);
        assertEquals(18.98, total, 0.01); // 15 + 1.5 + 15% HST
    }

    @Test
    public void testInvalidSizeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            BillCalculator.calculateTotal("XXL", 3);
        });
    }
}

