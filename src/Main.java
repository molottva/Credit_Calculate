public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 1,9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentOneYear + " рублей");

        int monthlyPaymentTwoYears = service.calculate(1_000_000, 2,9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentTwoYears + " рублей");

        int monthlyPaymentThreeYears = service.calculate(1_000_000, 3,9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentThreeYears + " рублей");
    }
}
