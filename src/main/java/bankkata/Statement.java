package bankkata;

import java.util.Date;

/**
 * Statement
 */
public class Statement {

    private final Amount amount;
	private final Date date;
	
	public enum StatementType {
		DEPOSIT,
		WITHDRAWAL
	}

	public Statement(Amount amount, Date date) {
		this.amount = amount;
		this.date = date;
	}
}