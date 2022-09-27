package org.softwire.training.bookish.models.database;

public class Users {

    private int userId;
    private String userFName;
    private String userLName;


    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserFName(String userFName) {
        this.userFName = userFName;
    }

    public void setUserLName(String userLName) {
        this.userLName = userLName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserFName() {
        return userFName;
    }

    public String getUserLName() {
        return userLName;
    }
}
