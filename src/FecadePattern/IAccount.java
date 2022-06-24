package FecadePattern;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public interface IAccount {
    public static final AtomicInteger sequence = new AtomicInteger();
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount to, BigDecimal amount);
    public int getAccountNumber();
}
