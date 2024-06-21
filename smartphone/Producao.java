package smartphone;

import java.util.Scanner;

import smartphone.produto.IPhone;
import smartphone.reprodutormusical.ReprodutorMusical;

public class Producao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IPhone iPhone = new IPhone();
		
		ReprodutorMusical musica = iPhone;
		System.out.print("Digite o nome da música: ");
		String music = sc.nextLine();
		
		System.out.println(musica.selecionarMusica(music));
		musica.tocar();
		musica.pausar();
		
		sc.close();
				
	}

}
