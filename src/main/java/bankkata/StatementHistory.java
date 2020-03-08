package bankkata;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import bankkata.Statement.StatementType;

/**
 * StatementHistory
 */
public class StatementHistory {

    private List<Statement> history = new ArrayList<Statement>();

    public void addStatementLine(Amount amount, Date date, StatementType statementType) {
        Amount amountToSave = (statementType == StatementType.DEPOSIT) ? amount : amount.negative();
        history.add(new Statement(amountToSave, date));
    }
}