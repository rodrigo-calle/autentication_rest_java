package com.upc.autentication.repository;

import com.upc.autentication.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
