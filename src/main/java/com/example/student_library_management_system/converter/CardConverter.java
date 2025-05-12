package com.example.student_library_management_system.converter;

import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.model.Card;
import com.example.student_library_management_system.requestdto.BookRequestDto;
import com.example.student_library_management_system.requestdto.CardRequestDto;

public class CardConverter {

    public static Card converterCardRequestDtoIntoCard(CardRequestDto cardRequestDto){
        Card card = new Card();

        card.setCardStatus(cardRequestDto.getCardStatus());

        return card;
    }
}
