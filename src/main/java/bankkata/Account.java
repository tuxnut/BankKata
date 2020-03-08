package bankkata;

import java.util.Date;

import bankkata.Statement.StatementType;

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
        statementHistory.addStatementLine(amount, date, StatementType.DEPOSIT);
    }

    public void withdrawal(Amount amount, Date date) {
        statementHistory.addStatementLine(amount, date, StatementType.WITHDRAWAL);
    }
}
