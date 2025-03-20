package atividade6;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número inicial:");
        numeroInicial = leia.nextInt();
        System.out.println("Digite o número final:");
        numeroFinal = leia.nextInt();

        if (numeroInicial >= numeroFinal) {
            System.out.println("Intervalo inválido!");
            leia.close();
        }
        
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("O número " + i + " é divisível por 3 e 5");
              } 
            }    
        for (int i = numeroInicial; i >= numeroFinal; i--) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("O número " + i + " é divisível por 3 e 5");
                  } 
                }       
    }
}
