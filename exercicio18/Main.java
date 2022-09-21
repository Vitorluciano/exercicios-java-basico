import java.util.Scanner;

public class Main {
	public static int selecionaDigito(int numero, int posicaoDigito) {
		int resto = (int) (numero % Math.pow(10, posicaoDigito));
		int digito = (resto - (int)(resto % Math.pow(10, posicaoDigito - 1))) / (int)Math.pow(10, posicaoDigito - 1);
		return digito;
	}

	public static String traduzUnidade(int digito) {
		String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String traducao = unidades[0];

		for(int i = 0; i < 10; i++) {
			if(digito == i) {
				traducao = unidades[i];
				break;
			}
		}

		return traducao;
	}

	public static String traduzDezena(int digito) {
		String[] dezenas = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
		String traducao = dezenas[0];

		for(int i = 0; i < 10; i++) {
			if(digito == i) {
				traducao = dezenas[i];
				break;
			}
		}

		return traducao;
	}

	public static String traduzCentena(int digito) {
		String[] centenas = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
		String traducao = centenas[0];

		for(int i = 0; i < 10; i++) {
			if(digito == i) {
				traducao = centenas[i];
				break;
			}
		}

		return traducao;
	}

	public static String traduzNumero(int numero) {
		String centenaMilhoes = traduzCentena(selecionaDigito(numero, 9));
		String dezenaMilhoes = traduzDezena(selecionaDigito(numero, 8));
		String unidadeMilhoes = traduzUnidade(selecionaDigito(numero, 7));
		String centenaMilhares = traduzCentena(selecionaDigito(numero, 6));
		String dezenaMilhares = traduzDezena(selecionaDigito(numero, 5));
		String unidadeMilhares = traduzUnidade(selecionaDigito(numero, 4));
		String centena = traduzCentena(selecionaDigito(numero, 3));
		String dezena = traduzDezena(selecionaDigito(numero, 2));
		String unidade = traduzUnidade(selecionaDigito(numero, 1));
	}

	public static int leNumero() {
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.print("Informe um número inteiro não negativo de até 9 dígitos: ");
		numero = teclado.nextInt();
		while(numero > 999999999 || numero < 0) {
			System.out.println("Você informou um número com mais de 9 dígitos!");
			System.out.print("Por favor, informe um número inteiro não negativo de até 9 dígitos: ");
			numero = teclado.nextInt();
		}

		return numero;
	}

	public static void main(String[] args) {
		System.out.println(traduzNumero(leNumero()));
	}
}