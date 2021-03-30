package za.ac.cput.assignment;
/*
 * @author:219169640 - Casey Michael Keven Crafford
 * ADP372S Assignment 1 Term 1
 * Using Github, Maven and Test Driven Development
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PersonTest
{
    private int num1,num2;
    private Person[] person;

    @BeforeEach
    public void setUp()  {
        person[0]=new Person();
        person[1]=new Person();
        person[2]=person[0];

        num1=10;
        num2=10;
    }

    @Test
    public void testObjectEquality(){
        assertEquals(num1,num2);
    }

    @Test
    public void testObjectIdentity(){
        assertSame(person[0],person[2]);
    }

    @Disabled
    @Test
    public void failingTest(){
        assertSame(person[0],person[1]);
    }

    @Timeout(10)
    @Test
    public void timeoutTest(){
        for(int i=1;i<=3;i++){
            System.out.println(person[i]);
        }
    }
}
