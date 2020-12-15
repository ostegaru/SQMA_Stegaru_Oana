import org.junit.Test;

import static org.junit.Assert.*;

public class ContructorTests {


    @Test
    public void testRight(){

        try {
            Student s = new Student("nume", 20, new int[]{10, 9, 8});
        } catch (Exception e) {
            fail("contructorul nu functioneaza");
        }

    }

    @Test
    public void testExistence(){
        Student s = new Student("nume", 20, new int[]{10, 9, 8});

        assertNotNull("obiectul nu a fost creat", s);
    }
}
