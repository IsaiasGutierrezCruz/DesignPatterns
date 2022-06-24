package FecadePattern;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class Checking implements IAccount {
    private BigDecimal money;
    private static final AtomicInteger sequence = new AtomicInteger();
    private int accountNumber;

    public Checking(BigDecimal initAmount){
        this.money = initAmount;
        this.accountNumber = sequence.incrementAndGet();
    }

    public void deposit(BigDecimal amount){
        this.money.add(amount);
        System.out.println("Deposit done from Checking");
    }

    public void withdraw(BigDecimal amount){
        this.money.subtract(amount);
        System.out.println("Withdraw done from Checking");
    }

    public void transfer(IAccount to, BigDecimal amount){
        BigDecimal initMoney = this.money;
        this.withdraw(amount);
        to.deposit(amount);
        System.out.println("The beginning amount is: "+ initMoney.toString() + " and the" +
                " final amount after the transfer is: "+ this.money.toString());
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}