package com.example.student_library_management_system.requestdto;

import com.example.student_library_management_system.enums.CardStatus;

public class CardRequestDto {
    private CardStatus cardStatus;

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
