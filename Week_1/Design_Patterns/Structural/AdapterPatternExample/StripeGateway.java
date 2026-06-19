package Week_1.Design_Patterns.Structural.AdapterPatternExample;

public class StripeGateway {

    public void pay(double amount) {
        System.out.println("Processing payment of Rs." + amount + " through Stripe");
    }
}
