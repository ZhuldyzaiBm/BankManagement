package outside;

import banking_system.Bank;

public class Tester {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        Customer cust = new Customer(bank);
        cust.openAccount();
        cust.depositMoney(500);
        cust.checkBalance();
        cust.withdrawMoney(600);
    }
}
