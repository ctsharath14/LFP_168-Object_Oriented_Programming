package stock_account_management;

public class StockManagementMain {

    public static void main(String[] args) {
        System.out.println("********************** Welcome To Stock Management **********************\n");
        //using stock object to call StockAccount methods
        StockAccount stock = new StockAccount();
        stock.stockPortfolio();
        stock.valueOfStock();
        System.out.println("\nStocks owned :");
        stock.displayData();
    }

}