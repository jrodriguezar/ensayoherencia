package javaapplication1;

/**
 *
 * @author jrodriguezar
 */
public class DividendStock extends Stock{
    
    protected double dividends;

    public DividendStock(double dividends, int totalShares, String symbol, double totalcost, double currentPrice) {
        super(totalShares, symbol, totalcost, currentPrice);
        this.dividends = dividends;
    }
    
    @Override
    public double getMarcket() {
        return (this.totalShares* this.currentPrice) + this.dividends;
    }
    
    
}