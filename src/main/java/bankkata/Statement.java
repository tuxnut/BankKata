package bankkata;

import java.io.PrintStream;
import java.util.Date;

/**
 * Statement
 */
public class Statement {

    private final Amount amount;
	private final Date date;

	public Statement(Amount amount, Date date) {
		this.amount = amount;
		this.date = date;
	}

	public void print(PrintStream stream) {
		
	}
}