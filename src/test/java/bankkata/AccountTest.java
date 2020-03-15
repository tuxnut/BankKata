package bankkata;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
/**
 * Unit test for simple App.
 */
public class AccountTest 
{
    @Mock
    private StatementHistory history;
    
    @Mock
    private Account account;

    @BeforeEach
    public void beforeEach() {
        history = mock(StatementHistory.class);
        account = new Account(history);
    }

    @Test
    public void shouldDepositAddStatementToHistoryWithSameAmount() {
        account.deposit(new Amount(10), new Date(10));

        verify(history).addStatementLine(new Amount(10), new Date(10));
    }

    @Test
    public void shouldWithdrawalAddStatementToHistoryWithInvertedAmount() {
        account.withdrawal(new Amount(10), new Date(10));

        verify(history).addStatementLine(new Amount(-10), new Date(10));
    }

    @Test
    public void shouldPrintHistoryDisplayEveryStatements() {
        account.deposit(new Amount(10), new Date(10));
        account.deposit(new Amount(15), new Date(11));
        account.withdrawal(new Amount(8), new Date(12));

        // PrintStream printer = mock(PrintStream.class);
        // account.printHistory(printer);

        // InOrder inOrder = Mockito.inOrder(printer);
        // inOrder.verify(printer).println("13/01/2012 | 2000.00  |          | 3000.00");
        // inOrder.verify(printer).println("13/01/2012 | 2000.00  |          | 3000.00");
        // inOrder.verify(printer).println("13/01/2012 | 2000.00  |          | 3000.00");
    }
}
