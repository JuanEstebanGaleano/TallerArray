import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class EncontrarNumeroMasGrandeTest {
    @Test
    public void testNumeroMasGrande(){
   ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(21);
        numeros.add(3);
        int resultado = EncontrarNumeroMasGrande.EncontrarNumeroMasGrande(numeros);
        assertEquals(21, resultado);
    }
}
