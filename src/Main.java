public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summa = 1_000_000;
        double term = 12;
        double bet = 9.99;

        double total = service.credit(summa, term, bet);
        System.out.println();
        System.out.println("Сумма 1_000_000  месяц  12");
        System.out.println("Результат " + total);

        System.out.println();
        System.out.println("Сумма  1_000_000  месяц 24");
        System.out.println("Результат " + service.credit(summa = 1_000_000, term = 24, bet = 9.99));

        System.out.println();
        System.out.println("Сумма  1_000_000  месяц 36");
        System.out.println("Результат " + service.credit(summa = 1_000_000, term = 36, bet = 9.99));
    }
}