package Week_1.Design_Patterns.Behavioral.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}


// Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

// Advantages
// Eliminates large if-else statements
// Easy to add new strategies
// Follows Open/Closed Principle
// Runtime behavior change
// Real-Life Examples
// Payment Methods (Credit Card, PayPal, UPI)
// Sorting Algorithms
// Route Selection in Google Maps
// Compression Algorithms