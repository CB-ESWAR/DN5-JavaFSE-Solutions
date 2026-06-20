public class ForecastTest {

    public static void main(String[] args) {

        double amount = 10000;
        double rate = 0.10;
        int years = 5;

        double result =
                FinancialForecast.futureValue(
                        amount,
                        rate,
                        years);

        System.out.println("Future Value = "
                + result);
    }
}