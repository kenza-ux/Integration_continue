
import static org.junit.Assert.*;

import org.junit.Test;

public class PersonnageTest {
    @Test
    public void HpInitiauxtest(){
        Personnage p1 = new Personnage (true,3);

        assertTrue(p1.est_Mort() );
    }
    @Test
    public void Mort()
    {
        Personnage p2= new Personnage(false,40);
        p2.Tuer();

        assertEquals("les points apres mort",0,p2.getPoints());
        assertTrue("est ce qu'il est mort",p2.est_Mort());
    }
}
