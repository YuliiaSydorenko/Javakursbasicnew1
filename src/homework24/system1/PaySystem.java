package homework24.system1;
//Создайте интерфейс PaymentSystem с методами:
//withdrawMoney(double amount) (снятие со счета)- списываются деньги со счета
//depositTransfer(double amount) (поступление денег на счет);
//checkBalance() (остаток на счете).
//Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
//Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
//Убедитесь, что каждый класс корректно выполняет каждую из операций.




public interface PaySystem {

    void withdrawMoney(double amount); // (снятие со счета) - списываются деньги со счета
    void depositTransfer(double amount); // (поступление денег на счет);
    double checkBalance(); // (остаток на счете).
}