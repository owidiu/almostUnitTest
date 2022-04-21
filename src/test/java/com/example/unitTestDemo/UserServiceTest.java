package com.example.unitTestDemo;

import com.example.unitTestDemo.user.User;
import com.example.unitTestDemo.user.UserRepository;
import com.example.unitTestDemo.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    public void should_create_new_user(){
        User user = new User();
        userRepository.save(user);

        User userById= userService.getUser(user.getId());
        assertThat(userById).isNotNull();

    }
}
