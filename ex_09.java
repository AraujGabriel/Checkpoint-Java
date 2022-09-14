package exercicios;
import java.util.Scanner;
//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.
public class ex_09 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a,b;

		System.out.printf("Insira o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Insira o segundo valor:  ");
		b = ler.nextDouble();
		
		if(a>b) {
			System.out.printf("O menor valor: %.2f ", b );
		}else {
			System.out.printf("O menor valor: %.2f ", a);
		}
}
}