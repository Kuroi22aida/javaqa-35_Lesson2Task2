public class Main {
    public static void main(String[] args) {

        int balance = 2304;
        int replenish = 2026;
        int bonus = 0;
        if (replenish > 1000) {
            bonus = replenish / 100;
        }
        balance = balance + replenish + bonus;
        System.out.println("Итоговый счет:" + balance);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
