package banking_system;

import java.util.ArrayList;

public class Bank {
    private ATM at;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank() {
        at = new ATM(this);
    }

    public int createAccount() {
        Account acc = new Account(accounts.size()+1);
        accounts.add(acc);
        return acc.getIndex();
    } 
    
    public ATM getATM() {
        return at; 
    }

    protected int AcctInfo(int acctNum) throws Exception {
        for(int i = 0; i < accounts.size(); ++i) {
            if (accounts.get(i).getIndex() == acctNum) {
                return accounts.get(i).getBalance();
            }
        }
        throw new Exception("Account has not been found");
    }
    
    protected void updateAcctBal(int acctNum, int diff) throws Exception {
        int count = 0;
        for(int i = 0; i < accounts.size(); ++i) {
            if (accounts.get(i).getIndex() == acctNum) {
                if (accounts.get(i).getBalance() + diff < 0) {
                    throw new Exception("The balance is negative");
                }
                accounts.get(i).setBalance(diff);
                break;
            }
            ++count;
        }
        if (count == accounts.size()) {
            throw new Exception("Account has not been found");
        }
    }

    

}
