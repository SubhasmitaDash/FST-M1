import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    void notEnoughFunds(){
        BankAccount account=new BankAccount(9);
        assertThrows(Exception.class, () ->account.withdraw(10));
    }

    @Test
    void enoughFunds(){
        BankAccount account=new BankAccount(100);
        assertDoesNotThrow(() -> account.withdraw(100));
    }

}
