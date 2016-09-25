package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    public static final String ERROR_SALDO = "Saldo insuficiente!";
    
    public SaldoInsuficienteException(String str){
        super();
        System.out.println(str);
}
}