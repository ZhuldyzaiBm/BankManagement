package banking_system;

public class Account {
    private int index;
    private int balance;

    protected Account(int i) {
        index = i;
        setBalance(0);
    }

    public int getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public int getIndex() {
        return index;
    }
}
