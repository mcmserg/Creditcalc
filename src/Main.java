public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summa = 1_000_000;
        double term = 12;
        double bid = 9.99;

        double itog = service.credit(summa, term, bid);
        System.out.println(itog);

    }
}