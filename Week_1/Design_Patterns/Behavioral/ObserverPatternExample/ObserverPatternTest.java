package Week_1.Design_Patterns.Behavioral.ObserverPatternExample;

public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Sonika");
        Observer webUser = new WebApp("Rahul");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // First update
        stockMarket.setStockPrice("TCS", 3850.50);

        // Second update
        stockMarket.setStockPrice("INFY", 1650.75);

        // Remove one observer
        stockMarket.deregisterObserver(webUser);

        // Third update
        stockMarket.setStockPrice("WIPRO", 520.25);
    }
}