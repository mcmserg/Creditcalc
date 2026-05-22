public class CreditPaymentService {
    public double credit(double summa, double term, double bet) {

        double eMonthly_payment = bet / 100 / 12;
        double K = eMonthly_payment * Math.pow(1 + eMonthly_payment, term) / (Math.pow(1 + eMonthly_payment, term) - 1);
        double montPl = summa * K;

        return (int) montPl;

    }
}
