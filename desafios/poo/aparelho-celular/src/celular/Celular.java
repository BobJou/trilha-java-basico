package celular;

import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class Celular implements AparelhoTelefonico,Navegador,ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA NO CELULAR");
		
	}
	@Override
	public void pausar() {	
		System.out.println("MÚSICA PAUSADA NO CELULAR");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONE UMA DAS MÚSICAS DO CELULAR");
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA NO CELULAR");
	}

	@Override
	public void adicionarPagina() {	
		System.out.println("ADICIONANDO PÁGINA NOVA NO CELULAR");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A ÁGINA NOVA NO CELULAR");
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO PARA O NÚMERO PELO CELULAR...");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO PELO CELULAR ...");
	}
	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ PELO CELULAR...");
	}

}
