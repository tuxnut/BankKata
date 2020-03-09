package bankkata;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * StatementHistory
 */
public class StatementHistory {

    private List<Statement> history = new ArrayList<Statement>();

    public void addStatementLine(Amount amount, Date date) {
        history.add(new Statement(amount, date));
    }
}