// Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %


package exercicios;

import java.util.Scanner;

public class ex_25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um numero: ");
		valor = ler.nextInt();
		
		if (valor == 0) {
			System.out.printf("0 é um numero neutro.");
		}
		else if (valor % 2 == 0) {
			System.out.printf("%d é par.", valor);
		}
		else {
			System.out.printf("%d é impar.", valor);
		}

	}

}