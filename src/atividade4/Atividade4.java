package atividade4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Vamos calcular a diferença entre dois produtos:");
		System.out.println("Digite o primeiro numerador");
		n1 = leia.nextFloat();
		System.out.println("Digite o primeiro divisor");
		n2 = leia.nextFloat();
		System.out.println("Digite o segundo numerador");
		n3 = leia.nextFloat();
		System.out.println("Digite o segundo divisor");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2)-(n3*n4);
		
		System.out.printf("A diferença entre os produtos é %.2f", resultado);

	}

}
