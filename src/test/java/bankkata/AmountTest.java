package bankkata;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

public class AmountTest 
{
    @Test
    public void shouldAmountEqualsSameValueAmount() {
        assertThat(new Amount(5)).isNotEqualTo(new Amount(8));
        assertThat(new Amount(5)).isEqualTo(new Amount(5));
    }

    @Test
    public void shouldAmountIncreaseWhenAdding() {
        Amount amount = new Amount(0);
        amount.add(new Amount(10));
        assertThat(amount).isEqualTo(new Amount(10));
    }
    
    @Test
    public void shouldAmountDecreaseWhenSubstracting() {
        Amount amount = new Amount(10);
        amount.substract(new Amount(8));
        assertThat(amount).isEqualTo(new Amount(2));
    }

    @Test 
    public void shouldAmountBeInvertedWhenNegative() {
        Amount positive = new Amount(10);
        assertThat(positive.negative()).isEqualTo(new Amount(-10));
    }

    @Test 
    public void shouldAmountBePositiveWhenAbsolute() {
        Amount positiveAmount = new Amount(10);
        assertThat(positiveAmount.absoluteValue()).isEqualTo(new Amount(10));
        Amount negativeAmount = new Amount(-10);
        assertThat(negativeAmount.absoluteValue()).isEqualTo(new Amount(10));
    }

    @Test
    public void shouldPrintItself() {
        Amount amount = new Amount(10);
        PrintStream printer = mock(PrintStream.class);

        amount.print(printer);

        verify(printer).format("%10d", 10);
    }
}
