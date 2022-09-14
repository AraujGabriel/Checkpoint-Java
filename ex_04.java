package exercicios;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
		
		Scanner val = new Scanner(System.in);
		
		double a,b,c,d,e;
		
		System.out.printf("Insira o primeiro valor: ");
		a = val.nextDouble();
		
		System.out.printf("Insira o segundo valor: ");
		b = val.nextDouble();
		
		System.out.printf("Insira o terceiro valor: ");
		c = val.nextDouble();
		
		System.out.printf("Insira o quarto valor: ");
		d = val.nextDouble();
				 
		e = (a+b+c+d)/4;
		
		System.out.printf("Media: %.2f ",e);
	}

}
