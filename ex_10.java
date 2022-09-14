package exercicios;
//10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir
//caso contrário, enviar mensagem avisando que os números são idênticos.

import java.util.Scanner;
public class ex_10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a,b;

		System.out.printf("Insira o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Insira o segundo valor:  ");
		b = ler.nextDouble();
		
		if(a>b) {
			System.out.printf("O maior valor: %.2f ", a );
		}else if(a==b) {
			System.out.print("Valores identicos");
		}else {
			System.out.printf("O maior valor: %.2f ", b);
		}

	}
}
