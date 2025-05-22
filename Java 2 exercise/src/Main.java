public class Main {
    public static void main(String[] args) {

        int check = 100;    // начальная сумма счета
        int replenishment = 1100;   // сумма пополнения счета
        int bonus;
        if (replenishment > 1000) {
            bonus = (replenishment / 100);  // Бонус начисляется как 1% от суммы пополнения сверх 1000
        } else {
            bonus = 0; // Бонус равен 0 если сумма пополнения менее 1000
        }
        int z = check + replenishment + bonus;  // Итоговая сумма должна включать бонусы

        System.out.println("Итоговая сумма на счете Клиента после пополнения с учетом бонуса = " + z);
        System.out.println("В том числе сумма начисленных бонусов за пополнение счета = " + bonus);
    }
}