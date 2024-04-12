package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    Controller controller;

    MyTest() {
        this.controller = new Controller();
    }

    @Test
    public void test() {
        assertEquals("Hello World!", controller.hello());
    }
}
