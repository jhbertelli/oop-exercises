package exercicio6;

import java.util.Random;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    private static final String[] PRODUCTS = { "Lapiseira", "Borracha", "Computador", "Álbum Musical" };

    public static void main(String[] args) {
        var stock = new Estoque();

        fillStock(stock);

        findProduct(stock);

        showConfirmDialog(null,
            String.format("Valor total do estoque: %.2f", stock.calculateTotalValue())
        );

        for (var product : stock.getProducts())
            System.out.println(
                String.format("Valor do produto %s: %.2f", product.getName(), product.getValue())
            );
    }

    private static void findProduct(Estoque stock) {
        String input = showInputDialog("Informe um produto para buscar:");

        if (stock.getIsProductInList(input))
            showConfirmDialog(null, String.format("O produto %s está no estoque!", input));
        else
            showConfirmDialog(null, String.format("Não foi possível encontrar o produto %s no estoque.", input));
    }

    private static void fillStock(Estoque stock) {
        for (int i = 0; i < 10; i++)
            stock.addProduct(createFakeProduct());
    }

    private static Produto createFakeProduct() {
        var product = new Produto();

        String productName = PRODUCTS[new Random().nextInt(PRODUCTS.length)];

        product.setName(productName);

        double value = new Random().nextDouble(100);

        product.setValue(value);

        return product;
    }
}
