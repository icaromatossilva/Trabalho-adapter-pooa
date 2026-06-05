package adapterPOOA;

/**
 * Classe adaptada (Adaptee). Representa o reprodutor de áudio antigo (legado) 
 * do sistema que possui uma interface incompatível com o novo padrão MediaPlayer.
 */

public class PlayerMP3 {
	
	/**
     * Executa especificamente arquivos no formato MP3.
     * * @param arquivo String contendo o formato do arquivo para validação.
     */
	
	public void tocarMusicaMP3(String arquivo) {
		
		if(arquivo.equalsIgnoreCase(".mp3")|| arquivo.equalsIgnoreCase("mp3")) {
			System.out.println("Sucesso: Reproduzindo musica em formato MP3");
		}else {
			System.out.println("O arquivo "+arquivo +" não é suportado. Este player roda apenas MP3.");
		}
	}

}