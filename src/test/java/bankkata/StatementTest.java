package bankkata;

import java.util.Date;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StatementTest
{
    @Test
    public void shouldComputeBalanceAfterDeposit() {
        Statement statement = new Statement(new Amount(100), new Date(10));
        Amount initialBalance = new Amount(100);
        
        Amount nextBalance = statement.computeBalance(initialBalance);

        assertThat(nextBalance).isEqualTo(new Amount(200));
    }
    
    @Test
    public void shouldComputeBalanceAfterWithdrawal() {
        Statement statement = new Statement(new Amount(-50), new Date(10));
        Amount initialBalance = new Amount(100);
        
        Amount nextBalance = statement.computeBalance(initialBalance);

        assertThat(nextBalance).isEqualTo(new Amount(50));
    }
    
    @Test
    public void shouldPrintIself() {
        Statement statement = new Statement(new Amount(-50), new Date(10));
    }
}
