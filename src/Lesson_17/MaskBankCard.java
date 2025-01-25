package Lesson_17;

public class MaskBankCard {
    public static void main(String[] args) {
        String cardNumber = "1234567812345678"; // Example card number
        String maskedCardNumber = maskCardNumber(cardNumber);
        System.out.println("Original: " + cardNumber);
        System.out.println("Masked: " + maskedCardNumber);
    }

    public static String maskCardNumber(String cardNumber) {
        return cardNumber.replaceAll("(?<=\\d{4})\\d(?=\\d{4})", "*");
    }
}

