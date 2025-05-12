package com.example.student_library_management_system.converter;

import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.model.Transaction;
import com.example.student_library_management_system.requestdto.BookRequestDto;
import com.example.student_library_management_system.requestdto.TransactionRequestDto;

public class TransactionConverter {
    public static Transaction converterTransactioRequestDtoIntoTrabsaction(TransactionRequestDto TransactionRequestDto){
        Transaction transaction = new Transaction();

        transaction.setDueDate(TransactionRequestDto.getDueDate());
        transaction.setFine(TransactionRequestDto.getFine());
        transaction.setTransactionType(TransactionRequestDto.getTransactionType());

        return transaction;
    }
}
