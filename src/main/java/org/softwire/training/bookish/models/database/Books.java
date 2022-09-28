package org.softwire.training.bookish.models.database;

//import org.codehaus.groovy.tools.StringHelper;

public class Books {
    private int bookId;
    private String bookName;
    private String authorName;
    private int copies;

    public int getBookId() {
        return bookId;
    }

    public String getAuthorName() {
        return authorName;
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

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
