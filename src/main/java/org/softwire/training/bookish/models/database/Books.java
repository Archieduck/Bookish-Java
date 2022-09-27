package org.softwire.training.bookish.models.database;

//import org.codehaus.groovy.tools.StringHelper;

public class Books {
    private int bookId;
    private String bookName;
    private int authorId;
    private int copies;

    public int getBookId() {
        return bookId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getBookName() {
        return bookName;
    }

    public int getCopies() {
        return copies;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
