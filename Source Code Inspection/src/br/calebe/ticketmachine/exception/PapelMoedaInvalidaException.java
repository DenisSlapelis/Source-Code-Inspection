package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
public static final String ERROR_PAPEL_MOEDA = "Papel moeda inválido!";
    
    public PapelMoedaInvalidaException(String str){
        super();
        System.out.println(str);
} 
}