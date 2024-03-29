package exercicio6;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> products = new ArrayList<>();

    public ArrayList<Produto> getProducts() {
        return products;
    }

    public void addProduct(Produto product) {
        products.add(product);
    }

    public boolean getIsProductInList(String productName) {
        for (var product : products)
            if (product.getName().equalsIgnoreCase(productName)) return true;

        return false;
    }

    public double calculateTotalValue() {
        double totalValue = 0;

        for (var product : products)
            totalValue += product.getValue();

        return  totalValue;
    }
}
