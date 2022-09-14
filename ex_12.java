package exercicios;
import java.util.Scanner;
//12. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura
//que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”
//caso contrário, exibir a mensagem “Terreno pequeno”.
public class ex_12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double h,b,a;
		
		System.out.printf("Insira o valor da altura:  ");
		h = ler.nextDouble();
		
		System.out.printf("Insira o valor da base:  ");
		b = ler.nextDouble();
		
		a = h*b;
		System.out.printf("Area do terreno: %.2f ",a);
		if(a>100) {
			System.out.printf("Terreno grande");
		} else {
			System.out.printf("Terreno pequeno");
		}
	}

}
