package sample;

import java.util.List;

public class ShoppingCartCalculator {

    public static double calculateTotal(List<Double> prices, boolean premiumCustomer) {

        if (prices == null || prices.isEmpty()) {
            throw new IllegalArgumentException("Cart is empty");
        }

        double total = 0;

        for (double price : prices) {

            if (price < 0) {
                throw new IllegalArgumentException("Negative price");
            }

            total += price;
        }

        if (total > 200) {
            total *= 0.9;
        } else if (total > 100) {
            total *= 0.95;
        }

        if (premiumCustomer) {
            total *= 0.95;
        }

        return Math.round(total * 100.0) / 100.0;
    }
}