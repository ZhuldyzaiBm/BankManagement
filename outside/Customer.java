package outside;

import banking_system.Bank;

public class Customer {
    private Bank bank;
    private int trackNum;

    public Customer(Bank b) {
        bank = b;
    }

    public void openAccount() {
        trackNum = bank.createAccount();
    }

    public void depositMoney(int amount) {
        bank.getATM().loginToAccount(trackNum);
        bank.getATM().deposit(amount);
        bank.getATM().logout();
    }

    public void withdrawMoney(int amount) {
        bank.getATM().loginToAccount(trackNum);
        bank.getATM().withdraw(amount);
        bank.getATM().logout();
    }

    public void checkBalance() {
        bank.getATM().loginToAccount(trackNum);
        bank.getATM().getBalance();
        bank.getATM().logout();
    }

}
