package banking_system;

public class ATM {
    private Bank bank;
    protected int currentAccNum = -1;

    protected ATM(Bank b) {
        bank = b;
    }

    public boolean loginToAccount(int acctNum) {
        try {
            bank.AcctInfo(acctNum);
        } catch(Exception ex) {
            System.out.println("Login unsuccesfull");
            return false;
        }
        currentAccNum = acctNum;
        System.out.println("Login succesfull");
        return true;
    }

    public boolean deposit(int amount) {
        try {
            bank.updateAcctBal(currentAccNum, amount);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public boolean withdraw(int amount) {
        try {
            bank.updateAcctBal(currentAccNum, -amount);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public int getBalance() {
        if (currentAccNum == -1) {
            return 0;
        }
        try {
            return bank.AcctInfo(currentAccNum);    
        } catch (Exception ex) {
            return 0;
        }
     }

    public void logout() {
        currentAccNum = -1;
    }
}
