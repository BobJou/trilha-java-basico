package aplicativos;

import interfaces.ReprodutorMusical;

public class MusicPlayer implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA NO MUSICPLAYER");
		
	}

	@Override
	public void pausar() {

		System.out.println("MÚSICA PAUSADA");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONE UMA DAS MÚSICAS DO PLAYER");
		
	}

}
