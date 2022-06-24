package FecadePattern;

import java.math.BigDecimal;

public class FecadePattern {
    public static void implementFecadePattern(){
        BankService firstService = new BankService();
        int firstAccount;
        firstAccount = firstService.createNewAccount("checking", BigDecimal.valueOf(1000));
        System.out.println(firstAccount);

        int secondAccount;
        secondAccount = firstService.createNewAccount("saving", BigDecimal.valueOf(2500));
        System.out.println(secondAccount);

        int thirdAccount;
        thirdAccount = firstService.createNewAccount("checking", BigDecimal.valueOf(1230));
        System.out.println(thirdAccount);

        Customer firstCustomer = new Customer();

    }
}
