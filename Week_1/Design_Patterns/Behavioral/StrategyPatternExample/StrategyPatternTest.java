package Week_1.Design_Patterns.Behavioral.StrategyPatternExample;

public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context =
                new PaymentContext(new CreditCardPayment());

        context.executePayment(5000);

        System.out.println();

        context.setPaymentStrategy(new PayPalPayment());

        context.executePayment(2500);
    }
}
