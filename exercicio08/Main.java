import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero, penultimo=0, ultimo=1, temp;

		System.out.print("Informe um número inteiro positivo: ");
		numero = teclado.nextLong();

		for(int i = 0; i < numero; i++) {
			if(i == 0) {
				System.out.printf("[%d]", i);
				penultimo = i;
			} else if(i == 1) {
				System.out.printf("[%d]", i);
				ultimo = i;
			} else {
				temp = penultimo;
				penultimo = ultimo;
				ultimo = ultimo + temp;
				System.out.printf("[%d]", ultimo);
			}
		}
	}
}
