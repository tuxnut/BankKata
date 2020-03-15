package bankkata;

import java.util.Date;

/**
 * Statement
 */
public class Statement {

	public static final String STATEMENT_HEADER = "   DATE    |  CREDIT  |  DEBIT   | BALANCE "

    private final Amount amount;
	private final Date date;

	public Statement(Amount amount, Date date) {
		this.amount = amount;
		this.date = date;
	}

	public String printFormattedStatement(Amount previousBalance) {
		String output = String.format("%tF | ", this.date);

		Amount absoluteAmount = amount.absoluteValue();
		previousBalance = computeBalance(previousBalance);

		output += (isStatementDeposit()) ?
			String.format("%s | %s | %s", absoluteAmount.printFormattedValue(), Amount.EMPTY_SPACE, previousBalance.printFormattedValue()):
			String.format("%s | %s | %s", Amount.EMPTY_SPACE, absoluteAmount.printFormattedValue(), previousBalance.printFormattedValue());
		
		return output;
	}

	public Amount computeBalance(Amount amount) {
		amount.add(this.amount);
		return amount;
	}

	private boolean isStatementDeposit() {
		return amount.isAmountPositive();
	}
}