package atividade5;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int a;
        boolean positivo = false, par = false;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        a = leia.nextInt();
        if (a > 0) {
            positivo = true;
        }
        else if (a % 2 == 0) {
            par = true;
        }
        if (par && positivo) {
            System.out.printf("O número %d é positivo e par", a);
        }
        if (par && !positivo) {
            System.out.printf("O número %d é negativo e par", a);
        }
        if (!par && positivo) {
            System.out.printf("O número %d é positivo e ímpar", a);
        }
        if (!par && !positivo) {
            System.out.printf("O número %d é negativo e ímpar", a);
        }
        leia.close();
    }
}
