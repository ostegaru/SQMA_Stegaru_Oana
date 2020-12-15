import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SetVarstaTests {


    @Test
    public void testRight(){
        Student s = new Student("nume", 20, new int[]{10, 9, 8});

        try{
            s.setVarsta(30);
            assertEquals("Varsta se seteaza corect", 30, s.getVarsta());
        } catch (Exception e) {
            fail("nu ar trebui sa ajunga aici, varsta nu e corecta");
        }

    }

    @Test
    public void testBoudary(){
        Student s = new Student("nume", 20, new int[]{10, 9, 8});

        try{
            s.setVarsta(18);
            assertEquals("Varsta se seteaza corect, limita inferioara", 18, s.getVarsta());
        } catch (Exception e) {
            fail("nu ar trebui sa ajunga aici, varsta nu e corecta");
        }


    }



}
