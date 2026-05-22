public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summa = 1_000_000;
        double term = 12;
        double bet = 9.99;

        double total = service.credit(summa, term, bet);
        System.out.println(total);

    }
}