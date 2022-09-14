package exercicios;

import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares.
		//Calcular e exibir o valor correspondente em Reais (R$)
		
		Scanner ler = new Scanner(System.in);
		//C para Cotação, D para Dolar e R para Reais
		double c,d,r;
		
		System.out.printf("Insira o valor da cotacao atual: ");
		c = ler.nextDouble();
		
		System.out.printf("Insira a quantidade do dolares:  ");
		d  = ler.nextDouble();
		
		r = c * d;
		
		System.out.printf("Seu valor de dolares em reais hoje vale: R$ %.2f",r);		
	
	}

}
