// Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez. Use Do While.

package externo;

import java.util.Scanner;

public class ex_36dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, r;
		
		System.out.printf("Digite um numero para obter a tabuada: ");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Nao pode numero negativo!");
			System.out.printf("Digite outro numero para obter a tabuada: ");
			num = ler.nextInt();
		}
		
		i = 1;
		
		do {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
			i++;
		}
		while(i < 11);

	}

}
