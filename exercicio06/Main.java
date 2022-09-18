import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero;
		long qtdDigitos = 0;

		System.out.print("Informe um número inteiro: ");
		numero = teclado.nextLong();

		do {
			qtdDigitos += 1;
			numero /= 10;
		} while(numero > 0);

		System.out.printf("O número informado possui %d dígito(s)!", qtdDigitos);
	}
}