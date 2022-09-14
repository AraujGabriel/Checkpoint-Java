package exercicios;

import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrar via teclado com o valor de cinco produtos.
		//Após as entradas, digitar um valor referente ao pagamento da somatória destes valores.
		//Calcular e exibir o troco que deverá ser devolvido.

		Scanner ler = new Scanner(System.in);
		// De "a" até "e", são os produtos, "f" é o total, "g" o pagamento e "h" o toroco
		double a,b,c,d,e,f,g,h;
		
		System.out.printf("Passe o produto: ");
		a = ler.nextDouble();
		
		System.out.printf("Passe o produto: ");
		b = ler.nextDouble();
		
		System.out.printf("Passe o produto: ");
		c = ler.nextDouble();
		
		System.out.printf("Passe o produto: ");
		d = ler.nextDouble();
		
		System.out.printf("Passe o produto: ");
		e = ler.nextDouble();
	
		f = a+b+c+d+e;
		
		System.out.printf("Total: %.2f ", f);
		
		System.out.printf("Insira o pagamento");
		g = ler.nextDouble();
		
		h = g-f;
		
		System.out.printf("O total do troco: %.2f", h);
				
	
		
	}

}
