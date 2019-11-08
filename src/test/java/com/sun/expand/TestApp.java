package com.sun.expand;


import org.junit.jupiter.api.Test;

import static com.sun.expand.App.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestApp {

    @Test
    public void testMyApp(){

        String s="hello";

        App app= new App();
        boolean b= didYouSayHello(s);
        System.out.println("hello test");
        assertTrue(b);
    }
}
