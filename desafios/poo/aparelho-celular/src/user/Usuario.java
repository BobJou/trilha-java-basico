package user;

import celular.Celular;

public class Usuario {

	public static void main(String[] args) {
		String nome = "Rodolfo";
		Celular cel = new Celular();
		cel.adicionarPagina();
		cel.exibirPagina();
		cel.atualizarPagina();
		cel.atender();
		cel.ligar();
		cel.iniciarCorreioDeVoz();
		cel.selecionarMusica();
		cel.tocar();
		cel.pausar();
		
		
	}

}
