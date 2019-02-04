package javaapplication1;

/**
 *
 * @author jrodriguezar
 */
public abstract class ShareAsset implements Asset{
    
    protected String symbol;
    protected double totalcost;
    protected double currentPrice;

    public ShareAsset(String symbol, double totalcost, double currentPrice) {
        this.symbol = symbol;
        this.totalcost = totalcost;
        this.currentPrice = currentPrice;
    }
    
    public double getprofit(){
        return 0;
    }
}