public class Main {
    public static void main(String[] args) {
        int balance = 600;
        int minpayment = 1000;
        int payment = 1001;

        // 1 бонусный рубль за каждые 100р пополнения
        // минимальный платеж 500р

        int bonusaccrual = 0;
        if (payment<minpayment) {
            bonusaccrual = 0;
        } else {
            bonusaccrual = payment/100;
        }


        int totalbalance = balance + payment + bonusaccrual;
        System.out.println("Ваш баланс: "+totalbalance+" рублей");


    }
}
