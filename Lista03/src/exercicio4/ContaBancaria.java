package exercicio4;

import javax.swing.JOptionPane;

public class ContaBancaria {
    private int accountNumber; // número da conta
    private String bearerName; // nome do titular
    private double balance; // saldo


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBearerName() {
        return bearerName;
    }

    public void setBearerName(String bearerName) {
        this.bearerName = bearerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double quant) {
        balance += quant;
    }

    public void withdraw(double quantity) {
        if (quantity >= balance) {
            JOptionPane.showConfirmDialog(null,
                "Saldo insuficiente! Transferência não realizada."
            );

            return;
        }

        balance -= quantity;
    }
}
