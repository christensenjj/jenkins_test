package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoControllerTest {

    @Test
    public void greeting() {
        DemoController controller = new DemoController();
        Greeting testGreeting = new Greeting(1,"Hello, Jacob!");
        assertEquals(testGreeting.getId(), controller.greeting("Jacob").getId());
        assertEquals(testGreeting.getContent(), controller.greeting("Jacob").getContent());
    }

    @Test
    public void checkList() {
        DemoController controller = new DemoController();
        Greeting testGreeting = new Greeting(10,"CheckList");
        assertEquals(testGreeting.getId(), controller.CheckList(10).getId());
        assertEquals(testGreeting.getContent(), controller.CheckList(0).getContent());
    }
}