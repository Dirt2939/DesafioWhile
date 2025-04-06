/*
 * 3. Escrever um algoritmo que lê 10 valores, um de cada vez, e conta quantos deles
 * estão no intervalo [10,20] e quantos deles estão fora do intervalo, escrevendo
 * estas informações.
 */
package desafio5;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio5Exer3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numC = 1, num = 0, numNoIntervalo = 0, numForaIntervalo = 0;
        
        while (numC <= 10) {
            
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            
            if (num >= 10 && num <= 20) {numNoIntervalo++;}
            else {numForaIntervalo++;}
            
            numC++;
        }
        
        System.out.println("Temos "+numNoIntervalo+" números dentro do intervalo"
                + " de 10 à 20 e temos outros "+numForaIntervalo+" números "
                        + "fora desse intervalo.");
    }
}
