package com.example.unitTestDemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("/users")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @PostMapping("/users/{userId}")
    public User updateUser(User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{userId}/delete")
    public void deleteUser(Integer userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/users/{userId}")
    public User getUser(Integer userId) {
        return userService.getUser(userId);
    }

}
