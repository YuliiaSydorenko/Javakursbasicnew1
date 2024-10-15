package homework24.paymentSystem;

public class BankAccount implements PaymentSystem {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }



    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in the bank account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " EUR from bank account.");
        }
    }


    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " EUR into bank account.");
    }

    // Реализация метода проверки баланса
    @Override
    public double checkBalance() {
        return balance;
    }

}
