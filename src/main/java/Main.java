public class Main {
    public static void main(String[] args) {
        int balance = 400;
        int addBalance = 1500;
        int bonus = 1;
        int addBonus;
        if (addBalance > 1000) {
            addBonus = addBalance / 100 * bonus;
            System.out.println("Итоговый счёт:" + (balance + addBalance + addBonus));
            System.out.println("Бонус:" + addBonus);
        } else {
            addBonus = 0;
            System.out.println("Итоговый счёт:" + (balance + addBalance));
            System.out.println("Бонус:" + addBonus);
        }


    }
}

