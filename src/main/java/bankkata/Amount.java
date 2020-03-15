package bankkata;

/**
 * Amount
 *
 */
public class Amount 
{
    public static final String EMPTY_SPACE = "        ";
	private int value;

    public Amount(int initialValue) {
        this.value = initialValue;
    }

    public void add(Amount amount) {
        this.value += amount.value;
    }
    
    public void substract(Amount amount) {
        this.value -= amount.value;
    }

    public Amount negative() {
        return new Amount(-value);
    }
    
    public Amount absoluteValue() {
        return (this.value >= 0 ? new Amount(this.value) : negative()); 
    }

    public String printFormattedValue() {
        Amount absoluteAmount = this.absoluteValue();
        return String.format("%8d", absoluteAmount.value);
    }

    @Override
    public boolean equals(Object obj) {
        Amount right = (Amount) obj;
        return (value == right.value);
    }

	public boolean isAmountPositive() {
		return (this.value >= 0);
	}
}
