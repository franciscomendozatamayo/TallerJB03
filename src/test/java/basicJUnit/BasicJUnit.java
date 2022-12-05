package basicJUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJUnit {

    @BeforeEach
    public void setup(){

        System.out.println("BeforeEach");

    }

    @AfterEach
    public void cleanup(){

        System.out.println("AfterEach");

    }

    @Test
    public void testSomething(){

        System.out.println("testSomething");

    }// end testSomething

    @Test
    public void testSomething1(){

        System.out.println("testSomething1");

    }// end testSomething

    @Test
    public void testSomething2(){

        System.out.println("testSomething2");

    }// end testSomething



}// end BasicJUnit
