package homework24.paymentSystem;

public class ElectronicWallet implements PaymentSystem{
    private double balance;
    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }



    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in the electronic wallet.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " USD from electronic wallet.");
        }
    }


    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " USD into electronic wallet.");
    }

    // Реализация метода проверки баланса
    @Override
    public double checkBalance() {
        return balance;
    }

}
