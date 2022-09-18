import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		double a, b, c;
		double discriminante, r1=0, r2=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Seja ax² + bx + c = 0 uma equação do 2º grau.");

		//lê a, b e c
		System.out.print("Informe o valor de a: ");
		a = teclado.nextDouble();
		System.out.print("Informe o valor de b: ");
		b = teclado.nextDouble();
		System.out.print("Informe o valor de c: ");
		c = teclado.nextDouble();

		//calcula o discriminante
		discriminante = b * b - 4 * a * c;

		//calcula as raízes
		if(discriminante >= 0) {
			r1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			r2 = (-b - Math.sqrt(discriminante)) / (2 * a);	
		}

		//mostra o resultado no console
		if(discriminante > 0) {
			System.out.println("A equação possui duas raízes r1 e r2 reais e distintas.");
			System.out.println("r1 = "+r1+" e r2 = "+r2);
		} else if(discriminante == 0) {
			System.out.println("A equação possui duas raízes reais e idênticas.");
			System.out.println("r1 = r2 = "+r1);
		} else {
			System.out.println("A equação não possui raízes reais.");
		}
	}
}