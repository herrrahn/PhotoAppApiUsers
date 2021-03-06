package com.rahn.PhotoAppApiUsers.users;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final Environment env;

    public UsersController(Environment env) {
        this.env = env;
    }

    @GetMapping("/status/check")
    public String status() {
        return "User Management running... on port :" + env.getProperty("local.server.port");
    }
}
