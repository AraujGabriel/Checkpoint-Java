package exercicios;

import java.util.Scanner;
 
public class ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double cel, far;
		
		System.out.printf("Insira a temperatura em Celsius: ");
		cel = ler.nextDouble();
		
		far = (cel*1.8)+32;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f", far);
	}

}
