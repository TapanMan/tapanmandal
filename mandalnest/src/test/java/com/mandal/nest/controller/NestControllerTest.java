package com.mandal.nest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class NestControllerTest {
    @Autowired
    private NestController nestController = new NestController();

    @Test
    void sayHello() {
    }

    @Test
    void sayHelloWorld() {
    }

    @Test
    void sayHelloWorldFriends() {
        int actual = nestController.sayHelloWorldFriends();
        assertTrue(actual > 0);
    }
}