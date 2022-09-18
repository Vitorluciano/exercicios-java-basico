import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double xp, yp, zp; //coordenadas do ponto P
		double xq, yq, zq; //coordenadas do ponto Q
		double modulo_diferenca; //modulo do vetor diferença entre P e Q
		double distancia; //d(P,Q)

		//le coordenadas de P
		System.out.println("Informe as coordenadas do ponto P");
		System.out.print("x -> ");
		xp = teclado.nextDouble();
		System.out.print("y -> ");
		yp = teclado.nextDouble();
		System.out.print("z -> ");
		zp = teclado.nextDouble();

		//le coordenadas de Q
		System.out.println("Informe as coordenadas do ponto Q");
		System.out.print("x -> ");
		xq = teclado.nextDouble();
		System.out.print("y -> ");
		yq = teclado.nextDouble();
		System.out.print("z -> ");
		zq = teclado.nextDouble();

		//calcula o modulo do vetor diferença
		modulo_diferenca = Math.pow((xq - xp), 2) + Math.pow((yq - yp), 2) + Math.pow((zq - zp), 2); 

		//calcula a distancia
		distancia = Math.sqrt(modulo_diferenca);

		//mostra a distância no console
		System.out.println("A distância entre P e Q é: "+distancia);
	}
}
