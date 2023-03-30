package com.example.userTracker.userDataSrc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.userTracker.userEntity.User;

@Repository
public interface UserDataSrc extends JpaRepository<User,Long>  {
}
