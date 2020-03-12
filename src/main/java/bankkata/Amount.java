package bankkata;

import java.io.PrintStream;

/**
 * Amount
 *
 */
public class Amount 
{
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

    public void print(PrintStream printer) {
        printer.format("%10d", this.value);
    }

    @Override
    public boolean equals(Object obj) {
        Amount right = (Amount) obj;
        return (value == right.value);
    }
}
