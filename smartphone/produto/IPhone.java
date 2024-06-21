package smartphone.produto;

import smartphone.aparelhotelefonico.AparelhoTelefonico;
import smartphone.navegadorinternet.NavegadorInternet;
import smartphone.reprodutormusical.ReprodutorMusical;

public class IPhone implements  ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

	public String ligar(String numero) {
		return "LIGANDO PARA O NÚMERO: " + numero + " PELO IPHONE.";
	}

	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO PELO IPHONE");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INCIANDO CORREIO DE VOZ PELO IPHONE");
	}

	public String exibirPagina(String url) {
		return "EXIBINDO URL: " + url + " PELO IPHONE.";
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA PELO IPHONE");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA PELO IPHONE");
	}

	public void tocar() {
		System.out.println("REPRODUZINDO MÚSICA PELO IPHONE");
	}

	public void pausar() {
		System.out.println("PAUSANDO MÚSICA PELO IPHONE");
	}

	public String selecionarMusica(String musica) {
		return "SELECIONANDO MÚSICA: " + musica + " PELO IPHONE.";
	}

}
