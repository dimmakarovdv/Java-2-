public class Main {
    public static void main(String[] args) {

        int initialAccountAmount = 100;    // начальная сумма счета
        int replenishmentAmount = 1100;   // сумма пополнения счета
        int bonus;
        // расчёт бонусной части
        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100);  // бонус начисляется как 1% от суммы пополнения сверх 1000
        } else {
            bonus = 0; // бонус равен 0 если сумма пополнения менее 1000
        }
        int totalInvoiceAmount = initialAccountAmount + replenishmentAmount + bonus;  // Итоговая сумма должна включать бонусы

        System.out.println("Итоговая сумма на счете Клиента после пополнения с учетом бонуса = " + totalInvoiceAmount);
        System.out.println("в том числе сумма начисленных бонусов за пополнение счета = " + bonus);
    }
}