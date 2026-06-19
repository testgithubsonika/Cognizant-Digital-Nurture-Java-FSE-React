package Week_1.Design_Patterns.Behavioral.ObserverPatternExample;

public class MobileApp implements Observer {

    private String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(
                "Mobile App [" + userName +
                "] received update: " +
                stockName + " = ₹" + price
        );
    }
}





// Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependent objects are notified automatically.

// Advantages
// Loose coupling
// Dynamic subscription/unsubscription
// Easy notification mechanism
// Real-World Examples
// Stock Market apps
// YouTube subscribers
// Weather monitoring systems