package exerciciosRevisão;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		
		int A, B, C, SOMA;
		
		System.out.println("Digite A: ");
		A = receba.nextInt();
		
		System.out.println("Digite B: ");
		B = receba.nextInt();
		
		System.out.println("Digite C: ");
		C = receba.nextInt();
		
		soma = A + B;
		
		System.out.println("Soma = " + soma);
		
		if(soma < C) {
			System.out.println("A soma é menor que C. ");
		} else { 
			System.out.println("A soma não é menor que C. ");
		}
      
		receba.close();
	}

}
