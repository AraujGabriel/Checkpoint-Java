// Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

package exercicios;

import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.printf("Informe a sua altura em: ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o seu peso em: ");
		peso = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc >= 20 && imc <= 25) {
			System.out.printf("Peso ideal");
		}
		else {
			System.out.printf("Peso não ideal.");
		}

	}

}