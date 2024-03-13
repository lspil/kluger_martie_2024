package org.example;

import org.example.adapter.UserAdapter;
import org.example.model.User;
import org.example.security.UserDetails;

public class Main {
    public static void main(String[] args) {
        User u = new User();

        UserDetails user = new UserAdapter(u);
        
    }
}