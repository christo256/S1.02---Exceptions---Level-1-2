package task1_S1_02_Level1;

import java.util.ArrayList;

import java.util.List;

public class Sale {

    private final List<Product> products;
    private double totalPrice;

    public void addProduct(Product product) {

        products.add(product);
    }

    public Sale() {
        products = new ArrayList<>();
        this.totalPrice = 0.0;

    }

    public List<Product> getListProducts() {
        return products;
    }

    public double calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException("Error: To make a Sale, you need add products first.");
        }

        totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


