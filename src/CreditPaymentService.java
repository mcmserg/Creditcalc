public class CreditPaymentService {
    public double credit(double summa, double term, double bid) {

        double es = bid / 100 /12;
        double K = es * Math.pow(1 + es, term) / (Math.pow(1 + es, term) - 1);
        double montPl = summa * K;

        return  (int) montPl;

    }
}
