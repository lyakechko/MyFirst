package com.pvt;

public class User {
    private static User instance;
    private int id;
    private String userName;
    private String login;
    private String password;
    private String phoneNumber;
    private int age;

    private User() {

    }

    public User(int id, String userName, String login, String password, String phoneNumber, int age) {
        this.id = id;
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User(1, "Илья", "testLogin", "testPasswor",
                    "3752553311111", 23);
        }
        return instance;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}