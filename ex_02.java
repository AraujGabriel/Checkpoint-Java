package exercicios;
import java.util.Scanner; 

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado
		
		Scanner ler = new Scanner(System.in);
		
		double l,a;
		
		System.out.printf("Insira a aresta do quadrado: ");
		l = ler.nextDouble();
		
		a = l*l;
		
		System.out.printf("o valor da area do quadrado: %.2f", a);
		

	}

}
