package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */
public class Animal {
    private String tipo;
    private String cor;
    private String especie;
    
    public Animal(String tipo, String cor, String especie){
        this.tipo = tipo;
        this.cor = cor;
        this.especie = especie;
    }

    public void exibirDados(){
        System.out.println("tipo " + this.tipo);
        System.out.println("cor " + this.cor);
        System.out.println("especie " + this.especie);
    }
}
