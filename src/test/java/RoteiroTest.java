
import domain.Roteiro;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoteiroTest {

    @Test
    public void constructRoteiro(){
               
          Roteiro roteiro = new Roteiro("testeRoteiro", 1.0);
          assertEquals("testeRoteiro", roteiro.getNome());
          assertEquals(1.0, roteiro.getDistancia(),1.0);
    }
    
}
