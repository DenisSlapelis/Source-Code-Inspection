package Testes;

import org.junit.Test;
import static org.junit.Assert.*;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

/**
 *
 * @author Denis
 */
public class TicketMachineTest {
    
    public TicketMachineTest(){
    
    }
    
    @Test 
    public void inserirValorTest() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(10);
        assertEquals(10, tm.getSaldo());
	assertEquals(5, tm.getTroco());
    }

@Test
    public void getTrocoTest() throws PapelMoedaInvalidaException{
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(10);
	assertEquals(5, tm.getTroco());
    }

    
}
