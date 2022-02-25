/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.util.Scanner;

/**
 *
 * @author taysa
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x[] = new int[5];
        int y[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor do " + (i + 1) + "º elemento do vetor 1");
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Informe o valor do " + (j + 1) + "º elemento do vetor 2");
            y[j] = sc.nextInt();
        }
        System.out.println("  Soma dos vetores  ");
        for (int c = 0; c < 5; c++) {
            System.out.print(x[c] + y[c] + "\t");
        }
        System.out.println("");
        System.out.println("  Produto dos vetores  ");
        for (int c = 0; c < 5; c++) {
            System.out.print(x[c] * y[c] + "\t");
        }
        int cont = 0;
        System.out.println("");
        System.out.println("  Diferença dos vetores  ");
        for (int c = 0; c < 5; c++) {
            for (int j = 0; j < 5; j++) {
                if (x[c] != y[j]) {

                } else {
                    cont++;
                }
            }
            if (cont < 1) {
                System.out.print(x[c] + "\t");
            }
            cont = 0;
        }
        System.out.println("");
        System.out.println("  Interseção ");
        for (int c = 0; c < 5; c++) {
            for (int j = 0; j < 5; j++) {
                if (x[c] == y[j]) {
                    System.out.print(x[c] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("  União ");
        for (int c = 0; c < 5; c++) {
            for (int j = 0; j < 5; j++) {
                if (y[c] != x[j]) {

                } else {
                    cont++;
                }
            }
            if (cont < 1) {
                System.out.print(y[c] + "\t");
            }
            cont = 0;
           System.out.print(x[c]+"\t");
        }
       
    }
}
