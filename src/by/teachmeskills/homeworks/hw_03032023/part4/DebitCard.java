package by.teachmeskills.homeworks.hw_03032023.part4;

import java.time.LocalDate;

public class DebitCard {
    private String cardNumber;
    private boolean isDebitCard;
    private String cardOwner;
    private LocalDate expirationDate;
    private String cardVerificationValue;

    public DebitCard(String cardNumber, boolean isDebitCard, String cardOwner, LocalDate expirationDate, String cardVerificationValue) {
        this.cardNumber = cardNumber;
        this.isDebitCard = isDebitCard;
        this.cardOwner = cardOwner;
        this.expirationDate = expirationDate;
        this.cardVerificationValue = cardVerificationValue;
    }

    public void validateCard() {
        class Validator {
            void checkCardNumber() {
                System.out.println(cardNumber.length() == 16 ? "Верный номер карты" : "Слишком короткий номер карты");
            }

            void checkValidity() {
                System.out.println(expirationDate.isAfter(LocalDate.now()) ? "Карта действительна" : "Карта недействительна");
            }

            void checkCardOwner() {
                System.out.println(cardOwner.length() > 0 ? "Верный владелец" : "Неверный владелец");
            }

            void checkCVV() {
                System.out.println(cardVerificationValue.equals("123") ? "Верный CVV" : "Неверный CVV");
            }

            void checkDebitCard() {
                System.out.println(isDebitCard ? "Карта дебетовая" : "Карта не дебетовая");
            }
        }
        Validator validator = new Validator();
        validator.checkValidity();
        validator.checkCardNumber();
        validator.checkCardOwner();
        validator.checkDebitCard();
        validator.checkCVV();
    }

    public static void main(String[] args) {
        DebitCard db = new DebitCard("1111111111111111", true, "Bob", LocalDate.of(2024, 11, 25), "123");
        db.validateCard();
    }
}