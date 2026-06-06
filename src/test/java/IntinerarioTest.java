
import domain.Eletronico;
import domain.Frota;
import domain.Intinerario;
import domain.Mobilia;
import domain.Roteiro;
import domain.Textil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class IntinerarioTest {
    
    @Test
    public void constructIntinerario(){
        
        long id = 12345;
        Eletronico eletronico = new Eletronico(1000, "testeEletronico", 1);
        Textil textil = new Textil(1001, "testeTextil", 1);
        Mobilia mobilia = new Mobilia(1002, "testeMobilia", 1);
        Roteiro roteiro = new Roteiro("testeRoteiro", 1.0);
        Frota frota = new Frota("testFrota", 3);
        
        Intinerario intinerario1 = new Intinerario(id, roteiro, frota, eletronico);
        Intinerario intinerario2 = new Intinerario(id, roteiro, frota, textil);
        Intinerario intinerario3 = new Intinerario(id, roteiro, frota, mobilia);
        
        assertEquals(id, intinerario1.getId());
        assertEquals(frota, intinerario1.getFot());
        assertEquals(roteiro, intinerario1.getRot());
        assertEquals(eletronico, intinerario1.getPed());
        
        assertEquals(id, intinerario2.getId());
        assertEquals(frota, intinerario2.getFot());
        assertEquals(roteiro, intinerario2.getRot());
        assertEquals(textil, intinerario2.getPed());
        
        assertEquals(id, intinerario3.getId());
        assertEquals(frota, intinerario3.getFot());
        assertEquals(roteiro, intinerario3.getRot());
        assertEquals(mobilia, intinerario3.getPed());
    }
}
