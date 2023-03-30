package com.example.userTracker.userController;

import org.springframework.http.HttpStatus;

import com.example.userTracker.userEntity.User;

import java.util.ArrayList;
import java.util.List;

public class UserResponse {
    HttpStatus status;
    User user;
    String message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserResponse(HttpStatus status, User user, String message) {
        this.status = status;
        this.user = user;
        this.message = message;
    }
}


class GetUsersResponse {
    HttpStatus status;
    List<User> users;
    String message;
    public GetUsersResponse() {
    }

    public GetUsersResponse(HttpStatus status, List<User> users, String message) {
        this.status = status;
        this.users = users;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}