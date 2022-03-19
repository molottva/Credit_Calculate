public class CreditPaymentService {

    public int calculate(int totalCredit, int years, double percentCredit){
        double monthlyPercent = percentCredit / 1200; // месячная процентная ставка (1200 = (12 * 100))
        double sumMonth = years * 12; // количество месяцев

        double monthlyPayment = totalCredit * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, - sumMonth));

        int monthlyPaymentInt = (int)monthlyPayment;
        return monthlyPaymentInt;
    }
}