package adapterPOOA;

import java.util.Scanner;

/**
 * Classe principal do sistema. Atua como o Cliente (Client) no padrão Adapter,
 * interagindo apenas com a interface abstrata {@link MediaPlayer} sem precisar
 * conhecer as implementações internas de cada player.
 */

public class Main {

	public static void main(String[] args) {
		MediaPlayer processador = new MediaAdapter();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Player de Música---");
		System.out.println("Digite a extensão do arquivo da sua música: ");
		String arquivo = sc.nextLine();
		
		processador.tocarMusica(arquivo);
		
		sc.close();

	}

}
