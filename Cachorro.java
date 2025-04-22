package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */
public class Cachorro extends Animal {
    private String nome;
    private int idade;
    private boolean vacinado;
    
    public Cachorro(String tipo, String cor, String especie, String nome, int idade, boolean vacinado){
        super(tipo, cor, especie);
        this.nome = nome;
        this.idade = idade;    
        this.vacinado = vacinado;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("nome " + this.nome);
        System.out.println("idade " + this.idade);
        System.out.println("vacinado " + this.vacinado);
    }
}
