/*
 * 4. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
imprima quantos anos serão necessários para que Zé seja maior que Chico.
 */
package desafio5;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio5Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double chico = 1.50, ze = 1.10, chicoAno = 0.2, zeAno = 0.3;
        int ano = 0;
        
        while (chico >= ze) {
            ano++;
            ze = ze + zeAno;
            chico = chico + chicoAno;
            
             System.out.println("Ano: " + ano + " | Chico: " + chico + " m | Zé: " + ze + " m");
        }
        
        System.out.println("Precisa de "+ano+" anos para Zé ser maior que Chico");
    }
}
