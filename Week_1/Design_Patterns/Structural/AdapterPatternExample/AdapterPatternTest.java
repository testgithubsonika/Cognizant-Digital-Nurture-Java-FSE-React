package Week_1.Design_Patterns.Structural.AdapterPatternExample;

public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor payPal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        payPal.processPayment(5000);
        stripe.processPayment(2500);
        payPal.processPayment(55500);
         stripe.processPayment(3500);
    }
}
