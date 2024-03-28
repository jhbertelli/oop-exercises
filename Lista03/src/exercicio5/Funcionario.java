package exercicio5;

public class Funcionario {
    private final float TAXES_PERCENTAGE = 0.3f;
    private String name;
    private double grossSalary; // salário líquido
    private String role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // salário líquido
    public double getNetSalary() {
        return grossSalary * (1 - TAXES_PERCENTAGE);
    }
}
