// Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

package exercicios;

import java.util.Scanner;

public class ex_26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um numero: ");
		valor = ler.nextInt();
		
		if (valor > 0) {
			System.out.print(valor * 2);
		}
		else {
			System.out.print(valor * 3);
		}

	}

}