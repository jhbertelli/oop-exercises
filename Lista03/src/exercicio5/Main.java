package exercicio5;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        Funcionario worker = new Funcionario();

        initializeWorker(worker);

        showWorker(worker);
    }

    private static void initializeWorker(Funcionario worker) {
        worker.setName(
            showInputDialog("Informe o nome do funcionário:")
        );

        worker.setRole(
            showInputDialog("Informe o cargo do funcionário:")
        );

        worker.setGrossSalary(
            Double.parseDouble(
                showInputDialog("Informe o salário bruto do funcionário:")
            )
        );
    }

    private static void showWorker(Funcionario worker) {
        showConfirmDialog(null,
            String.format("Funcionário: %s\nCargo: %s\nSalário bruto: %.2f\nSalário líquido: %.2f",
                worker.getName(),
                worker.getRole(),
                worker.getGrossSalary(),
                worker.getNetSalary()
            )
        );
    }
}
