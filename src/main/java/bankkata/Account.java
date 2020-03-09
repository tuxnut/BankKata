package bankkata;

import java.util.Date;

/**
 * Account
 *
 */
public class Account 
{
    private StatementHistory statementHistory;

    public Account(StatementHistory statementHistory) {
        this.statementHistory = statementHistory;
    }

    public void deposit(Amount amount, Date date) {
        statementHistory.addStatementLine(amount, date);
    }

    public void withdrawal(Amount amount, Date date) {
        Amount withdrawalAmount = amount.negative();
        statementHistory.addStatementLine(withdrawalAmount, date);
    }

    public void printHistory() {}
}
