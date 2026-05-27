package com.learn.user.services;

import com.learn.user.entitities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveUser(User user);

    public User getUserById(String userId);

    public List<User> getAllUser();

    public User getUserByEmail(String email);

    public User deleteUserById(String userId);

    public User updateUser(User user, String userId);


}
