package com5.example.socialmedia.Service;

import com5.example.socialmedia.exeption.UserNotFountException;
import com5.example.socialmedia.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int id;

    static {
        users.add(new User(++id, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++id, "Jules", LocalDate.now().minusYears(30)));
    }

    public List<User> getUsers(){
        return users;
    }
    public User findOne(int id){
       return users.stream().filter(user -> user.getId() == id)
               .findFirst().orElseThrow(()-> new UserNotFountException("User "+id+"doest not exist"));
    }
    public User addUser(User user){
        user.setId(++id);
        users.add(user);
        return user;
    }
}
