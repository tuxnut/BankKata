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
    public void shouldPrintADepositStatement() {
        Statement statement = new Statement(new Amount(50), new Date(10));
        assertThat(statement.printFormattedStatement(new Amount(0))).isEqualTo("1970-01-01 |       50 |          |       50");
    }
    
    @Test
    public void shouldPrintAWithdrawalStatement() {
        Statement statement = new Statement(new Amount(-20), new Date(10));
        assertThat(statement.printFormattedStatement(new Amount(80))).isEqualTo("1970-01-01 |          |       20 |       60");
    }
}
