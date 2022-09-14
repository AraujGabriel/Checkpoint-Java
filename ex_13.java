package exercicios;
import java.util.Scanner;
//13. Entrar via teclado com três valores distintos. Exibir o maior deles.
public class ex_13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.printf("Insira o primeiro valor");
		a = ler.nextInt();
		
		System.out.printf("Insira o segundo valor");
		b = ler.nextInt();
		
		System.out.printf("Insira o terceiro valor");
		c = ler.nextInt();
		
		if((a>b) &&(a>c)) {
			System.out.printf("O maior valor: %d", a);
		}else if ((b>a)&&(b>c)) {
			System.out.printf("O maior valor: %d", b);
		}else {
			System.out.printf("O maior valor: %d", c);
		}
	}
}
