package Week_1.Design_Patterns.Behavioral.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal.");
    }
}