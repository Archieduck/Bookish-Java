package org.softwire.training.bookish.models.database;

public class Authors {
    private int authorId;
    private String authorFName;
    private String authorLName;

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthorFName() {
        return authorFName;
    }

    public String getAuthorLName() {
        return authorLName;
    }
}
