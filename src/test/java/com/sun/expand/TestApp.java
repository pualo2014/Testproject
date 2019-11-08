package com.sun.expand;


import org.junit.jupiter.api.Test;

import static com.sun.expand.App.*;
import static org.junit.jupiter.api.Assertions.*;
 

public class TestApp {

    @Test
    public void testMyApp(){

        String s="hello";

        App app= new App();
        try {
            boolean b = didYouSayHello(s);

            assertTrue(b);
            System.out.println("************* test was a total success ************** ");
        }catch(Exception e){
            System.out.println("************* test was a total fail ************** ");
        }

    }
}
