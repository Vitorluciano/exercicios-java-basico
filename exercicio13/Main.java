import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numeros = new int[100];
		int indiceMenor, temp;

		for(int i = 0; i < 100; i++) {
			numeros[i] = rand.nextInt(101);
			System.out.printf("[%d]", numeros[i]);
		}

		//selection sort
		for(int i = 0; i < 99; i++) {
			indiceMenor = i;
			for(int j = i; j < 100; j++) {
				if(numeros[j] < numeros[indiceMenor]) {
					indiceMenor = j;
				}
			}
			if(indiceMenor != i) {
				//swap
				temp = numeros[i];
				numeros[i] = numeros[indiceMenor];
				numeros[indiceMenor] = temp;
			}
		}

		System.out.println(); //pula linha

		//imprime array
		for(int i = 0; i < 100; i++) {
			System.out.printf("[%d]", numeros[i]);
		}
	}
}