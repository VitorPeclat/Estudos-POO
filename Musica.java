package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */

public class Musica implements Midia{
    public void executar(){
        System.out.println("A música está sendo executada");
    }
    public void pausar(){
        System.out.println("A música está sendo pausada");
    }
    public void finalizar(){
        System.out.println("A música está sendo finalizada");   
    }
}
