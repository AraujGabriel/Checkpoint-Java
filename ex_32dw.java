//Criar uma rotina de entrada que aceite somente um valor positivo. Use Do While.

package exercicios;

import java.util.Scanner;

public class ex_32dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
		
		do {
			System.out.println("Nao pode número negativo!");
            System.out.printf("Digite outro número: ");
            num = ler.nextInt();
		}
		while(num <= 0);
	}

}
