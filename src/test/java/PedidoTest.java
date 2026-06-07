
import domain.Eletronico;
import domain.Mobilia;
import domain.Textil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PedidoTest {
   
        @Test
            public void constructPedidos(){
                
            Eletronico eletronico = new Eletronico(1000, "testeEletronico", 1);
            assertEquals(1,eletronico.getTamanho());
            assertEquals("testeEletronico",eletronico.getNome());
            assertEquals(1000, eletronico.getId());
            
            Textil textil = new Textil(1001, "testeTextil", 1);
            assertEquals(1,textil.getTamanho());
            assertEquals("testeTextil",textil.getNome());
            assertEquals(1001, textil.getId());
            
            Mobilia mobilia = new Mobilia(1002, "testeMobilia", 1);
            assertEquals(1,mobilia.getTamanho());
            assertEquals("testeMobilia",mobilia.getNome());
            assertEquals(1002, mobilia.getId());
            
        }
        
    }
    

