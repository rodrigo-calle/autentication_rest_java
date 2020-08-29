package com.upc.autentication.business;


import com.upc.autentication.entities.User;
import com.upc.autentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Business {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        return (List<User>)userRepository.findAll();

    }



}
