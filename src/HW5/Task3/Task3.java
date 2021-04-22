package HW5.Task3;

public class Task3 {
    public static void main(String[] args) {
        Card card = new Card("1234123412341234", "debit", "Ivan", 2023, 5, 12,
                "565");
        Card card2 = new Card("123412341234123", "credit", "Ivan", 2023, 7, 22,
                "775");
        Card card3 = new Card("1234123412341234", "debit", "Ivan", 2019, 5, 12,
                "531");

        if (card.checkCard()){
            System.out.println("данные карты верны");
        }else System.out.println("данные карты не верны");

        if (card2.checkCard()){
            System.out.println("данные карты верны");
        }else System.out.println("данные карты не верны");

        if (card3.checkCard()){
            System.out.println("данные карты верны");
        }else System.out.println("данные карты не верны");

    }
}
