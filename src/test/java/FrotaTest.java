
import domain.Frota;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FrotaTest {
    
    @Test
    public void constructFrota(){
        
        Frota frota = new Frota("testFrota", 3);
        assertEquals("testFrota", frota.getNome());
        assertEquals(3, frota.getPessoal());
    }
    
}
