package org.example.adapter;

import org.example.model.User;
import org.example.security.UserDetails;

public class UserAdapter implements UserDetails {

    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public String username() {
        return user.getUsername();
    }

    @Override
    public String password() {
        return user.getPassword();
    }
}
