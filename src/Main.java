public class Main {
    public static void main(String[] args) {
        int pricebullet = 30_000;
        int periodbonus = 20;

        int bonusmilles = pricebullet/periodbonus;

        System.out.println("Вам начислено: " +bonusmilles+ " бонусных миль");
    }
}
