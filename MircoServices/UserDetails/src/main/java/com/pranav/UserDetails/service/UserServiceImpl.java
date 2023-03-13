package com.pranav.UserDetails.service;

import com.pranav.UserDetails.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    public UserServiceImpl() {
        System.out.println("Hkjdbjkdnjksdnjk");
    }

    //fake users
    List<User> list = List.of(
            new User(1311L, "Durgesh Tiwari", "23525625"),
            new User(1312L, "Ankit Tiwari", "99999"),
            new User(1314L, "Ravi Tiwari", "888")
    );
    @Override
    public User getUsers(Long userId) {
        System.out.println(userId+" njdsknjknd");
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
