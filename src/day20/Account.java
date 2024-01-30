package day20;

import javax.naming.InsufficientResourcesException;

public class Account {
    private long balance;

    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientResourcesException{
        if(balance<money){
            throw new InsufficientResourcesException("잔고부족 : "+(money-balance)+"모자람!");
        }
        balance -= money;
    }
}

