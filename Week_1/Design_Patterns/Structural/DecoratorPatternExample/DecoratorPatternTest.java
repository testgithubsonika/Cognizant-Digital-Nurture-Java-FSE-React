package Week_1.Design_Patterns.Structural.DecoratorPatternExample;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier notifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        notifier.send("Your order has been shipped!");
    }
}