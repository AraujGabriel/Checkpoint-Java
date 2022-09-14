package exercicios;
//8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.

import java.util.Scanner;

public class ex_08 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	double a,b;

	System.out.printf("Insira o primeiro valor: ");
	a = ler.nextDouble();
	
	System.out.printf("Insira o segundo valor:  ");
	b = ler.nextDouble();
	
	if(a>b) {
		System.out.printf("O maior valor: %.2f ", a );
	}else {
		System.out.printf("O maior valor: %.2f ", b);
	}
	
	
	
	
}
}