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
            void validation() {
                if (cardNumber.length() == 16) {
                    if (isDebitCard) {
                        if (cardOwner.length() > 0) {
                            if (expirationDate.isAfter(LocalDate.now())) {
                                if (cardVerificationValue.equals("123")) {
                                    System.out.println("Карта валидна");
                                } else {
                                    System.out.println("Карта не валидна");
                                }
                            } else {
                                System.out.println("Карта недействительна");
                            }
                        } else {
                            System.out.println("Неверный владелец");
                        }
                    } else {
                        System.out.println("Карта не дебетовая");
                    }
                } else {
                    System.out.println("Слишком короткий номер карты");
                }
            }
        }
        Validator validator = new Validator();
        validator.validation();
    }

    public static void main(String[] args) {
        DebitCard db = new DebitCard("1111111111111111", true, "Bob", LocalDate.of(2024, 11, 25), "123");
        db.validateCard();
    }
}
