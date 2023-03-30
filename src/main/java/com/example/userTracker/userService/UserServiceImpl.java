package com.example.userTracker.userService;

import java.util.List;
import java.util.Optional;

import com.example.userTracker.userEntity.User;
import com.example.userTracker.userDataSrc.UserDataSrc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDataSrc userDataSrc;
    @Override
    public List<User> getAllUsers() {
        return userDataSrc.findAll();
    }

    @Override
    public User getUserById(Long Id) {
        return userDataSrc.findById(Id).get();
    }

    @Override
    public User createNewUser(User user) {
        return userDataSrc.save(user);
    }

    @Override
    public void deleteByIds(List<Long> Ids) {
        userDataSrc.deleteAllByIdInBatch(Ids);
    }
}
