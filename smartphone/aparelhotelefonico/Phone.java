package smartphone.aparelhotelefonico;

public class Phone implements AparelhoTelefonico {

	public String ligar(String numero) {
		return numero;
	}

	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

}