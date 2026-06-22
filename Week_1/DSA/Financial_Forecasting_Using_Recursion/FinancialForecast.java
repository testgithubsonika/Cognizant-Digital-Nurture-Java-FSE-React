

public class FinancialForecast {

    public static double futureValue(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }

        return futureValue(principal, growthRate, years - 1)
                * (1 + growthRate);
    }

    public static double futureValueIterative(double principal, double growthRate,int years) {
        double value = principal;

        for (int i = 1; i <= years; i++) {
            value = value * (1 + growthRate);
        }

        return value;
    }

    public static void main(String[] args) {
        double principal = 10000;
        double growthRate = 0.10;
        int years = 5;

        double recursiveResult =
                futureValue(principal, growthRate, years);

        double iterativeResult =
                futureValueIterative(principal, growthRate, years);

        System.out.println("Recursive Future Value: ₹"
                + recursiveResult);

        System.out.println("Iterative Future Value: ₹"
                + iterativeResult);
    }
}