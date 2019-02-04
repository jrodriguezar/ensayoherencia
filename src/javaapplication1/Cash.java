package javaapplication1;

/**
 *
 * @author jrodriguezar
 */
public class Cash implements Asset{
    
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarcket() {
        return this.amount;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}