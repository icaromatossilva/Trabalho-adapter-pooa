package adapterPOOA;

/**
 * Classe Adaptadora (Adapter). Implementa a interface {@link MediaPlayer} e 
 * atua como uma ponte para redirecionar as chamadas de reprodução para as
 * classes de formatos específicos (componentes legados ou novos).
 */

public class MediaAdapter implements MediaPlayer {
	private PlayerMP4 mp4;
	private PlayerWav wav;
	private PlayerMP3 mp3;
	
	
	/**
     * Identifica a extensão do arquivo e direciona para o player correto.
     * * @param arquivo Nome ou extensão do arquivo de áudio (ex: "mp4", "wav")
     */
	@Override
	public void tocarMusica(String arquivo) {
		if(arquivo.equalsIgnoreCase(".mp4") || arquivo.equalsIgnoreCase("mp4")) {
			mp4 = new PlayerMP4();
			mp4.tocarMusicaMP4(arquivo);
		}else if(arquivo.equalsIgnoreCase(".wav") || arquivo.equalsIgnoreCase("wav")) {
			wav = new PlayerWav();
			wav.tocarWav(arquivo);
		} else if(arquivo.equalsIgnoreCase(".mp3") || arquivo.equalsIgnoreCase("mp3")){
			mp3 = new PlayerMP3();
			mp3.tocarMusicaMP3(arquivo);
		}else
			System.out.println("O arquivo "+arquivo +" não é suportado pelo sistema.");
	}

}
