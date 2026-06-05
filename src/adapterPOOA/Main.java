package adapterPOOA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PlayerMP3 processador = new PlayerMP3();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Player de Música---");
		System.out.println("Digite a extensão do arquivo da sua música: ");
		String arquivo = sc.nextLine();
		
		processador.tocarMusicaMP3(arquivo);
		
		sc.close();

	}

}
