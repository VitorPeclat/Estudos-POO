
package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */
public class Audio implements Midia{
    public void executar(){
        System.out.println("O audio está sendo executado");
    }
    public void pausar(){
        System.out.println("O audio está sendo pausado");
    }
    public void finalizar(){
        System.out.println("O audio está sendo finalizado");   
    }
}
