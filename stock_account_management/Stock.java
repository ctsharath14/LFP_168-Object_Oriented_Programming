package stock_account_management;

public class Stock {
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    //setter and getter  methods
    public void setStockName(String stockName){
        this.stockName=stockName;
    }

    public String getStockName(){
        return stockName;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShares = numberOfShare;
    }

    public int getNumberOfShare() {
        return numberOfShares;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", noOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                '}';
    }
}