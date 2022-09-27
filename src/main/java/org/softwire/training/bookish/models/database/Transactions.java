package org.softwire.training.bookish.models.database;

import java.time.LocalDate;

public class Transactions {

    private int transactionId;
    private int bookId;
    private int userId;
    private LocalDate dueBack;
    private LocalDate dateBorrowed;
    private Boolean isCompleted;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public void setDateBorrowed(LocalDate dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public void setDueBack(LocalDate dueBack) {
        this.dueBack = dueBack;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDate getDateBorrowed() {
        return dateBorrowed;
    }

    public LocalDate getDueBack() {
        return dueBack;
    }

}
