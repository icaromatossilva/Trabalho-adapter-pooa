package adapterPOOA;

/**
 * Classe de serviço especializada na reprodução exclusiva de arquivos de áudio em formato WAV.
 */

public class PlayerWav {
	
	/**
     * Valida e reproduz a mídia se o formato for estritamente WAV.
     * * @param arquivo String contendo o formato do arquivo para validação.
     */
	
	public void tocarWav(String arquivo) {
		if(arquivo.equalsIgnoreCase(".wav") || arquivo.equalsIgnoreCase("wav")) {
			System.out.println("Sucesso: Reproduzindo musica em formato WAV");
		}else {
			System.out.println("O arquivo "+arquivo +" não é suportado. Este player roda apenas WAV.");
		}
	}

}
