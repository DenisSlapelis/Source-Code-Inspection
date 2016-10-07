package Testes;

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @Test
    public void obterValorPapelMoedaTest() {
        PapelMoeda dinheiro = new PapelMoeda(5,2);
        assertEquals(5, dinheiro.getValor());
        assertEquals(2,dinheiro.getQuantidade());
        dinheiro.setQuantidade(4);
        assertEquals(4, dinheiro.getQuantidade());
        assertEquals(5,dinheiro.getValor());
    }
}
