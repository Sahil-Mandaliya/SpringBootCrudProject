package com.example.userTracker.userService;

import com.example.userTracker.userEntity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long Id);
    public User createNewUser(User user);
    public void deleteByIds(List<Long> Ids);
}


/*
public class UserService extends JpaRepository<User,Long> {
    ArrayList<User> userList;
    public List<User> getAllUsers() {
        userList =  new ArrayList<>();
        userList.add(new User(1,"abc",9999));
        userList.add(new User(2,"abcdd",999));
        userList.add(new User(3,"abcsss",99));
        return userList;
    }
}
*/