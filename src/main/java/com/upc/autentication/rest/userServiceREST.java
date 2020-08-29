package com.upc.autentication.rest;

import com.upc.autentication.business.Business;
import com.upc.autentication.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@RestController
@RequestMapping("/api")
public class userServiceREST {
  @Autowired
  private Business business;

  @GetMapping("/users")
  public List<User> listUser(){ return business.listUsers(); }

  @PostMapping("/user")
  public User createUser(@RequestBody User user){
      User a;
      try{
            a =  business.createUser(user);
      }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No se pudo crear", e);
      }
      return a;
  }

}
