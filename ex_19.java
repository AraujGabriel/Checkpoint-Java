// Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo que a média de aprovação é igual a cinco.


package exercicios;

import java.util.Scanner;

public class ex_19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite o valor da prova p1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor da prova p2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + (2 * p2)) / 3;
		
		if(media >= 5) {
			System.out.printf("Parabens, sua media foi %.1f, voce esta aprovado!", media);
		}
		else {
			System.out.printf("Sua media foi %.1f, voce esta reprovado!.", media);
		}

	}

}