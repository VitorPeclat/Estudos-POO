package com.mycompany.estudo;

/*  Data: 11/12
*   Nome: Vitor Peclat
*   Descrição: Código para realizar uma sobrecarga do método "soma" de uma calculadora
*/

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    
    public Carro(String marca,String modelo,String cor,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public Carro(String marca,String modelo,String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = 0;
    }
    public Carro(String marca,String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = null;
        this.ano = 0;
    }
    public void exibirDados(){
        System.out.println("Marca " + this.marca);
        System.out.println("Modelo " + this.modelo);
        System.out.println("cor " + this.cor);
        System.out.println("ano " + this.ano);
    }
}
