package com.bookseller.bookseller.Service;

import com.bookseller.bookseller.Model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
