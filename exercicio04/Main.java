import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		double preco;
		int quantidade;
		double total;

		//le o nome do produto
		System.out.print("Informe o nome do produto: ");
		nome = teclado.nextLine();

		//le o preço do produto
		System.out.print("Informe o preço do produto: ");
		preco = teclado.nextDouble();

		//le a quantidade de unidades do produto
		System.out.print("Informe quantas unidades desejas comprar: ");
		quantidade = teclado.nextInt();

		//calcula o total a ser pago em função da quantidade comprada
		if(quantidade <= 10) {
			total = preco * quantidade;
		} else if(quantidade <= 20) {
			total = (preco * quantidade) - 0.1*(preco * quantidade); 
		} else if(quantidade <= 50) {
			total = (preco * quantidade) - 0.2*(preco * quantidade); 
		} else {
			total = (preco * quantidade) - 0.25*(preco * quantidade); 
		}

		//informa ao usuário o total a ser pago
		System.out.println("nome do produto: "+nome);
		System.out.printf("total a ser pago: R$%.2f\n", total);
	}
}