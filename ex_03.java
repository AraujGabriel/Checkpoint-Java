package exercicios;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
		
		Scanner ler = new Scanner(System.in);
		
		double b,h,a;
		
		System.out.printf("Insira a base do triangulo:  ");
		b = ler.nextDouble();
		
		System.out.printf("Insira a altura do triangulo:  ");
		h = ler.nextDouble();
		
		a = ( b*h )/2;
		
		System.out.printf("Valor da area do triangulo: %.2f",a);
				
				
		
	}

}
