package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {

    
    String msg = "Papel moeda inválido.";

    public PapelMoedaInvalidaException(String msg) {
        super(msg);
    }

    
}
