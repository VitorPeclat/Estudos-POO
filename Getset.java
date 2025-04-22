package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */

public class Getset {
    private String nome;
    private int idade;
    private boolean medicado;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public boolean isMedicado(){
        return this.medicado;
    }
    public void setMedicado(boolean medicado){
        this.medicado = medicado;
    }
    
    public Getset(String nome, int idade, boolean medicado){
        setNome(nome);
        setIdade(idade);
        setMedicado(medicado);
    }
}
