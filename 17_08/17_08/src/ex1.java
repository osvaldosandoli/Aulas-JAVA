import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int  contador;
		
		int numero;
		int maior = Integer.MIN_VALUE;
		
		int menor = Integer.MAX_VALUE;
		int[] x = new int[5];
		
		
		//.length é um valor automatico q completa com um nuero certo
		
		for (contador=0;contador<x.length;contador++) {
			System.out.print("digite o valor: ");
			x[contador] = teclado.nextInt();
			if(x[contador] > maior || contador ==0) {
				maior = x[contador];
			}
			else if (x[contador] < menor || contador ==0) {
				menor = x[contador];
			}
			
		}
		System.out.println("maior = " +maior);
		System.out.println("menor = " + menor);
		
		
		

	}

}
