package com.mycompany.estudo;

import javax.swing.JOptionPane;

/*  Data: 11/12
*   Nome: Vitor Peclat
*   Descrição: Código para realizar uma sobrecarga do método "soma" de uma calculadora
*/

public class Calculadora{
    int soma = 0;
    boolean verificar = false;
    public void soma(int numA, int numB){
        numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        soma = numA + numB;
        System.out.println("Soma = "+ soma);
    }
    
    public void soma(double numA, double numB){
        while(!verificar){
            try{
                numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));  
                double soma = numA + numB;
                verificar = true;
                System.out.println("Soma = "+ soma);
            }
            catch(Exception e){
                System.out.println("Erro " + e);
            }
        }
    }
    
    public void soma(int numA,int numB,int numC){
        numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));        
        numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        soma = numA + numB+ numC;
        System.out.println("Soma = "+ soma);
    }
}