package adapterPOOA;

/**
 * Interface alvo (Target) que define o comportamento esperado para os 
 * novos reprodutores de mídia do sistema.
 */

public interface MediaPlayer {
	/**
     * Transmite ou reproduz o arquivo com base na extensão fornecida.
     * * @param arquivo Nome ou extensão do arquivo de áudio/vídeo (ex: "mp4", "wav", "mp3")
     */
	public void tocarMusica(String arquivo);

}
