package com.bookseller.bookseller.Service;

import com.bookseller.bookseller.Model.User;


import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);


    void makeAdmin(String username);
}
