package exercicio1;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(7);

        double area = circulo.calculateArea();
        double perimeter = circulo.calculatePerimeter();

        System.out.println(String.format("Área: %.2f", area));
        System.out.println(String.format("Perímetro: %.2f", perimeter));
    }
}