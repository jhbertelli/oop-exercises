package exercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaBancaria account = new ContaBancaria();

        account.setBearerName("Luigi");
        account.setAccountNumber(1);
        account.setBalance(1000);

        double depositAmount = Double.parseDouble(
            JOptionPane.showInputDialog("Informe um valor para realizar o depósito:")
        );

        account.deposit(depositAmount);

        showAccountData(account);

        double withdrawAmount = Double.parseDouble(
            JOptionPane.showInputDialog("Informe um valor para realizar o saque:")
        );

        account.withdraw(withdrawAmount);

        showAccountData(account);
    }

    private static void showAccountData(ContaBancaria account) {
        String message = String
            .format("Nome: %s\nNúmero da conta: %d\nSaldo: %.2f",
                account.getBearerName(),
                account.getAccountNumber(),
                account.getBalance()
            );

        JOptionPane.showConfirmDialog(null, message);
    }
}
