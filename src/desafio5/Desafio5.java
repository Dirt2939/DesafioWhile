/*
 * 1. Escreva um algoritmo que leia 30 valores e conte quantos números digitados
* são pares, impares e nulos.
 */
package desafio5;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numC = 1, numero = 0, impar = 0, par = 0, nulo = 0;         
        
        while (numC <= 30) {
        
            System.out.println("Digite um número: ");
            numero = ler.nextInt();
            
            if(numero == 0) {nulo++;}
            else if(numero % 2 == 0) {par++;}
            else if(numero % 2 != 0) {impar++;}
            
            numC++;
                    
        }
        
        System.out.println("Ímpar: "+impar+"\nPar: "+par+"\nNulo: "+nulo);
        
    }
    
}
