package bankkata;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AccountTest 
{
    @Test
    public void shouldDepositAddStatementToHistory() {
        StatementHistory history = new StatementHistory();
        Account account = new Account(history);        

        Amount amount = new Amount(10);
        Date date = new Date(10);
        account.deposit(amount, date);

        
    }
}
