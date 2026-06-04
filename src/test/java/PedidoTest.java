
import domain.Eletronico;
import domain.Mobilia;
import domain.Textil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PedidoTest {
   
        @Test
            public void constructPedidos(){
                
            Eletronico eletronico = new Eletronico("testeEletronico", 1);
            assertEquals(1,eletronico.getTamanho());
            assertEquals("testeEletronico",eletronico.getNome());
            
            Textil textil = new Textil("testeTextil", 1);
            assertEquals(1,textil.getTamanho());
            assertEquals("testeTextil",eletronico.getNome());
            
            Mobilia mobilia = new Mobilia("testeMobilia", 1);
            assertEquals(1,mobilia.getTamanho());
            assertEquals("testeMobilia",eletronico.getNome());
            
        }
        
    }
    

