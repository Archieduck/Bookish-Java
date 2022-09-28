package org.softwire.training.bookish.models.page;

import org.softwire.training.bookish.models.database.Books;

import java.util.List;

public class AllBooksPageModel {
    private List<Books> books;

    public void AllBooksPageModel() {}

    public List<Books> getBooks() {
        return books;
    }
    public void setBooks(List<Books> books) {
        this.books = books;
    }


}