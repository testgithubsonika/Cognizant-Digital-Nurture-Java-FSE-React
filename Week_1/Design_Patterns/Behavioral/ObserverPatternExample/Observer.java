package Week_1.Design_Patterns.Behavioral.ObserverPatternExample;

public interface Observer {

    void update(String stockName, double price);

}




// Observer Pattern Roles
// Role	Class
// Subject	Stock
// Concrete Subject	StockMarket
// Observer	Observer
// Concrete Observers	MobileApp, WebApp
// Client	ObserverPatternTest