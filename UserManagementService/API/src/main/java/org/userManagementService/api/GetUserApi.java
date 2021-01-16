package org.userManagementService.api;

import java.util.concurrent.atomic.AtomicLong;

import org.UserManagementService.Entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetUserApi {
    @GetMapping("/getUser")
    public String getUser(@RequestParam(value = "name", defaultValue = "Anonymous") String name) {
        return "test";
    }
}