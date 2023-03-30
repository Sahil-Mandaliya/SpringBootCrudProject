package com.example.userTracker.userController;

import com.example.userTracker.userService.UserService;
import com.example.userTracker.userEntity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public GetUsersResponse getAllUsers() {
        try {
            List<User> users = userService.getAllUsers();
            return new GetUsersResponse(HttpStatus.OK, users, "Success");
        } catch (Exception e) {
            return new GetUsersResponse(HttpStatus.INTERNAL_SERVER_ERROR, null, "Something went wrong");
        }
    }

    @GetMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable String id) {
        Long Id = Long.parseLong(id);
        try {
            User user = userService.getUserById(Id);
            return new UserResponse(HttpStatus.OK, user, "Success");
        } catch (Exception e) {
            return new UserResponse(HttpStatus.INTERNAL_SERVER_ERROR, null, "Something went wrong");
        }
    }


    @PostMapping("/user")
    public UserResponse createNewUser(@RequestBody User user) {
        try {
            user = userService.createNewUser(user);
            return new UserResponse(HttpStatus.OK, user, "Success");
        } catch (Exception e) {
            return new UserResponse(HttpStatus.INTERNAL_SERVER_ERROR, null, "Something went wrong");
        }
    }

    @DeleteMapping("/users")
    public UserResponse deleteByIds(@RequestBody List<Long> Ids) {
        System.out.println(Ids);
        try {
            userService.deleteByIds(Ids);
            return new UserResponse(HttpStatus.OK, null, "Success");
        } catch (Exception e) {
            return new UserResponse(HttpStatus.INTERNAL_SERVER_ERROR, null, "Something went wrong : "+e.getMessage());
        }
    }
}

