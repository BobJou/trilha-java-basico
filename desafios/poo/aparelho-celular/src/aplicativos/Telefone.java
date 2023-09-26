package aplicativos;
import interfaces.AparelhoTelefonico;
public class Telefone implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("LIGANDO PARA O NÚMERO...");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO...");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ...");
		
	}
	
}
