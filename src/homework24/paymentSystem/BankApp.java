package homework24.paymentSystem;

public class BankApp {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(200);  // Банк с 200 евро
        PaymentSystem eWallet = new ElectronicWallet(500);  // Электронный кошелек с 50 долларов


        bankAccount.depositTransfer(200);    // Пополнение счета на 200 евро
        bankAccount.withdrawMoney(150);      // Снятие 10 евро
        System.out.println("Bank Account Balance: " + bankAccount.checkBalance() + " EUR");


        eWallet.depositTransfer(100);        // Пополнение кошелька на 100 долларов
        eWallet.withdrawMoney(50);           // Снятие 15 долларов
        System.out.println("Electronic Wallet Balance: " + eWallet.checkBalance() + " USD");
    }


    }

