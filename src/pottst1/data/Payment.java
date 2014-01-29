package pottst1.data;

import java.math.BigDecimal;

public class Payment
{
    public static final BigDecimal TAX_RATE = new BigDecimal(0.06);

    private BigDecimal amount;

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }
}
