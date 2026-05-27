package com.learn.user.services;

import com.learn.user.entitities.User;
import com.learn.user.exceptions.UserException;
import com.learn.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        String uuid = UUID.randomUUID().toString();
        user.setUserId(uuid);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).
                orElseThrow(() -> new UserException("User does not exist with Id "+userId));
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UserException("User not find by given email "+email));
    }

    @Override
    public User deleteUserById(String userId) {
        User user = getUserById(userId);
        userRepository.deleteById(userId);
        return user;
    }

    @Override
    public User updateUser(User user, String userId) {
        User savedUser = getUserById(userId);
        if(user.getName() != null) savedUser.setName(user.getName());
        if(user.getAbout() != null) savedUser.setAbout(user.getAbout());
        if(user.getEmail() != null) savedUser.setEmail(user.getEmail());
        return userRepository.save(savedUser);
    }
}
