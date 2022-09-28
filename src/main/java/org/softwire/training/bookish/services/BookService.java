package org.softwire.training.bookish.services;

import org.softwire.training.bookish.models.database.Books;
import org.softwire.training.bookish.models.database.Technology;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService extends DatabaseService {

    public List<Books> getAllBooks() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM bookish.Books")
                        .mapToBean(Books.class)
                        .list()
        );
    }

    public void addBooks(Books books) {
        jdbi.useHandle(handle ->
                handle.createUpdate("INSERT INTO bookish.Books (book_name, author_name, copies) VALUES (:book_name, :author_name, :copies)")
                        .bind("book_name", books.getBookName())
                        .bind("author_name", books.getAuthorName())
                        .bind("copies", books.getCopies())
                        .execute()
        );
    }

    public void deleteBooks(int bookIdToDelete) {
        jdbi.useHandle(handle ->
                handle.createUpdate("DELETE FROM bookish.books WHERE book_id = :id")
                        .bind("id", bookIdToDelete)
                        .execute()
        );
    }

    public void updateBooks(int bookId, String uBookName, String uAuthorName, int uCopies){
        jdbi.useHandle(handle ->
                handle.createUpdate("UPDATE bookish.books SET book_name = " + uBookName + ", author_name = uAuthorName, copies = uCopies WHERE book_id = bookId")
                        .execute()
        );
    }

}
