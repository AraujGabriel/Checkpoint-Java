// //Criar uma rotina de entrada que aceite somente um valor positivo. Use While.

package exercicios;

import java.util.Scanner;

public class ex_32w {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, i, r;
		
		System.out.printf("Digite um numero positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.println("Não pode numero negativo!");
			System.out.printf("Digite um outro numero: ");
			num = ler.nextInt();
		}

	}

}
