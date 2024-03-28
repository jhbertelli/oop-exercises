package exercicio1;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculateArea() {
        return Math.PI * (raio * raio);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * raio;
    }
}
