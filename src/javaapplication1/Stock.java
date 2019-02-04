package javaapplication1;

/**
 *
 * @author jrodriguezar
 */
public class Stock extends ShareAsset{
    
    protected int totalShares;
    
    public Stock(int totalShares, String symbol, double totalcost, double currentPrice) {
        super(symbol, totalcost, currentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarcket() {
        return this.totalShares* this.currentPrice;
    }

    @Override
    public double getProfit() {
        return (this.totalShares* this.currentPrice) - this.totalcost;
    }
}