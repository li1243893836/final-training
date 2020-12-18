package com.itly.entity;

public class UserVO {
    private int UserId;
    private String userName;
    private String userPw;
    private String faceImage;
    private String userText;
    private int userDisplay;

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public int getUserDisplay() {
        return userDisplay;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public void setUserDisplay(int userDisplay) {
        this.userDisplay = userDisplay;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "UserId=" + UserId +
                ", userName='" + userName + '\'' +
                ", userPw='" + userPw + '\'' +
                ", faceImage='" + faceImage + '\'' +
                ", userText='" + userText + '\'' +
                ", userDisplay=" + userDisplay +
                '}';
    }
}
