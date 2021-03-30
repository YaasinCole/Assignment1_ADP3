package za.ac.cput.assignment;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student1;
    private Student student2;
    private Student student3;
    private int num1, num2;

    @BeforeEach
    public void setUp() {

        student1 = new Student();
        student2 = new Student();
        student3 = student1;

        num1 = 21;
        num2 = 21;
    }

    @Test
    public void testObjectEquality(){
        assertEquals(num1, num2);
    }

    @Test
    public void testObjectIdentity(){
        assertSame(student1, student3);
    }

    @Ignore
    @Test
    public void failingTest(){
        assertSame(student1, student2);
    }

    @Timeout(15)
    @Test
    public void timeoutTest(){
        for(int i=1; i<=3; i++){
            String loop = "student" + i;
            System.out.println(loop);
        }
    }
}