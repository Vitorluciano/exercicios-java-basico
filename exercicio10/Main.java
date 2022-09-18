import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double aporteMensal;
		double juroMensal;
		double montante=0;
		String continuar;
		long anosProcessados=0;

		System.out.print("Informe o valor dos aportes mensais: ");
		aporteMensal = teclado.nextDouble();

		System.out.print("Informe a taxa de juros mensais: ");
		juroMensal = teclado.nextDouble();
		juroMensal /= 100;

		teclado.nextLine();

		do {
			for(int i = 0; i < 12; i++) {
				montante += montante * juroMensal + aporteMensal;
			}

			anosProcessados++;

			System.out.printf("Saldo do investimento após %d ano: %.2f\n", anosProcessados, montante);

			System.out.print("Desejas processar mais um ano? [s/n] -> ");
			continuar = teclado.nextLine();
		} while(continuar.equals("s"));
	}
}
