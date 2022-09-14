package exercicios;

import java.util.Scanner;
public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
		
	Scanner ler = new Scanner(System.in);
	
	double h,b,a;
	
	System.out.printf("Insira o primeiro valor:  ");
	h = ler.nextDouble();
	
	System.out.printf("Insira o segundo valor:  ");
	b = ler.nextDouble();
	
	a = b * h;
			
	System.out.printf("Valor da area: %.2f", a);
	
	}

}
