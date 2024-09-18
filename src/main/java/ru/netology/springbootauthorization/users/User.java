package ru.netology.springbootauthorization.users;

import jakarta.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "User name is empty")
    private String user;

    @NotBlank(message = "Password is empty")
    private String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
