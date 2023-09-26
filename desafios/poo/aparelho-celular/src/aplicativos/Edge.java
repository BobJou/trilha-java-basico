package aplicativos;

import interfaces.Navegador;

public class Edge implements Navegador{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA PELO EDGE");
		
	}

	@Override
	public void adicionarPagina() {
		System.out.println("ADICIONANDO PÁGINA NOVA NO EDGE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A ÁGINA NOVA NO EDGE");
		
	}

}
