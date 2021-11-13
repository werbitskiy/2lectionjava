public class Main {
    public static void main(String[] args) {
        int balance = 600;
        int minpayment = 500;
        int payment = 2589;

        // 1 бонусный рубль за каждые 100р пополнения
        // минимальный платеж 500р

        int bonusaccrual = payment/100;

        if (payment<minpayment){
            bonusaccrual = 0;
        }

        int totalbalance = balance + payment ;
        System.out.println("Ваш баланс: "+totalbalance+" рублей Начисленные бонусы: "+bonusaccrual+" рублей");


    }
}
