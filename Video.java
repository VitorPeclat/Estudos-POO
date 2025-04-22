/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudo;

/**
 *
 * @author Peclat
 */
public class Video implements Midia{
    public void executar(){
        System.out.println("O vídeo está sendo executado");
    }
    public void pausar(){
        System.out.println("O vídeo está sendo pausado");
    }
    public void finalizar(){
        System.out.println("O vídeo está sendo finalizado");   
    }
}
