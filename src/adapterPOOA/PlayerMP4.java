package adapterPOOA;

/**
 * Classe de serviço especializada na reprodução exclusiva de arquivos de vídeo/áudio MP4.
 */

public class PlayerMP4 {
	
	/**
     * Valida e reproduz a mídia se o formato for estritamente MP4.
     * * @param arquivo String contendo o formato do arquivo para validação.
     */
	
	public void tocarMusicaMP4(String arquivo) {
		if(arquivo.equalsIgnoreCase(".mp4") || arquivo.equalsIgnoreCase("mp4")) {
			System.out.println("Sucesso: Reproduzindo musica em formato MP4");
		}else {
			System.out.println("O arquivo "+arquivo +" não é suportado. Este player roda apenas MP4.");
		}
	}

}
