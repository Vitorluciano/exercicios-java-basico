import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] vetores = new int[2][50];
		int[] vetorFinal = new int[100];
		int menor0, menor1, temp;
		int i, j, k;

		//preenche vetores[0] e vetores[1]
		for(i = 0; i < 50; i++) {
			vetores[0][i] = rand.nextInt(101);
			vetores[1][i] = rand.nextInt(101);
		}

		//imprime vetores desordenados
		System.out.println("VETORES DESORDENADOS:");
		for(i = 0; i < 2; i++) {
			System.out.printf("\nvetores[%d]: ", i);
			for(j = 0; j < 50; j++) {
				System.out.printf("[%d]", vetores[i][j]);
			}
		}

		//pula duas linhas
		System.out.println("\n");

		//ordenada vetores por selection sort
		for(i = 0; i < 49; i++) {
			menor0 = i;
			menor1 = i;
			for(j = i + 1; j < 50; j++) {
				if(vetores[0][j] < vetores[0][menor0]) {
					menor0 = j;
				}
				if(vetores[1][j] < vetores[1][menor1]) {
					menor1 = j;
				}
			}
			if(menor0 != i) {
				//swap
				temp = vetores[0][i];
				vetores[0][i] = vetores[0][menor0];
				vetores[0][menor0] = temp;
			}
			if(menor1 != i) {
				temp = vetores[1][i];
				vetores[1][i] = vetores[1][menor1];
				vetores[1][menor1] = temp;
			}
		}

		//imprime vetores ordenados
		System.out.println("VETORES ORDENADOS:");
		for(i = 0; i < 2; i++) {
			System.out.printf("\nvetores[%d]: ", i);
			for(j = 0; j < 50; j++) {
				System.out.printf("[%d]", vetores[i][j]);
			}
		}

		//monta vetor maior ordenadamente
		j = 0;
		k = 0;
		for(i = 0; i < 100; i++) {
			if(vetores[0][j] <= vetores[1][k]) {
				vetorFinal[i] = vetores[0][j];
				if(j < 49) {
					j++;
				}
			} else {
				vetorFinal[i] = vetores[1][k];
				if(k < 49) {
					k++;
				}
			}
		}

		//imprime vetorFinal
		System.out.print("\n\n\nvetorFinal: ");
		for(i = 0; i < 100; i++) {
			System.out.printf("[%d]", vetorFinal[i]);
		}
	}
}