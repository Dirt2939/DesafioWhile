/*
 * 5. Escrever um algoritmo que leia uma quantidade desconhecida de números e conte 
quantos deles estão nos seguintes intervalos: [0,25], [26,50], [51,75] e [76,100].
A entrada de dados deve terminar quando for lido um número negativo.
 */
package desafio5;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio5Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numC = 0, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, 
            intervalo4 = 0, num = 0;
        
        while (numC < 1) {
            
            System.out.println("Fale um número: ");
            num = ler.nextInt();
            
            if (num >= 0 && num <= 25) {
                intervalo1++;
            }
            else if (num >= 26 && num <= 50) {
                intervalo2++;
            }
            else if (num >= 51 && num <= 75) {
                intervalo3++;
            }
            else if (num >= 76 && num <= 100) {
                intervalo4++;
            }
            else if (num < 0) {
                numC++;
            }
            else { System.out.println("Intervalo não contabilizado,"
                    + " precisa ser de [0,100]"); }
        }
        
        System.out.println("Intervalo [0,25]: "+intervalo1+"\nIntervalo "
                + "[26,50] "+intervalo2+"\nIntervalo [51,75]: "+intervalo3
            + "\nIntervalo [76,100]: "+intervalo4);
        
    }
}
