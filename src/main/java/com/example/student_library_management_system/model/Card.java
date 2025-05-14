package com.example.student_library_management_system.model;

import com.example.student_library_management_system.enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class Card {
    // -> id, cardStatus, createdDate, updatedDate

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "card_status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @Column(name = "card_date", nullable = false)
    @CreationTimestamp  //when new card iis created it will automatically add date and time
    private String createdDate;

    @Column(name = "updated_date", nullable = false)
    @UpdateTimestamp  //when card gets updated it will add date and time
    private Date updateDate;

    @JsonBackReference
    @JoinColumn  // it joins the primary key student id of student table as foreign key in card table
    @OneToOne  // one card is assigned to one student
    private Student student;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<Book> bookList;

    @JsonManagedReference
    @OneToMany(mappedBy = "card")
    private List<Transaction> transactionList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
