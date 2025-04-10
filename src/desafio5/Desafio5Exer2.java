/*
 * 2. Escreva um algoritmo que gere o números de 1000 a 1999 e escreva aqueles
* que, divididos por 11, dão resto igual a 5.
 */
package desafio5;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio5Exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numC = 1, num = 1000;
        
        while (numC <= 999) {
            
            if (num % 11 == 5) {System.out.println(num);}

            num++;               
            numC++;
        }
        
    }
}
