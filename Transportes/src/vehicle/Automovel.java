package vehicle;

public class Automovel extends Veiculo {
	
	// M�todo que liga o ve�culo e apresenta a mensagem de que ele est� ligado.
	// Utiliza o m�todo da superclasse.
	public void ligar(){
		super.ligar();
		System.out.println ("Autom�vel est� ligado");
	
	}
	// M�todo que desliga o ve�culo e apresenta a mensagem de que ele est� desligado.
	// Utiliza o m�todo da superclasse.
	public void desligar(){
		super.desligar();
		System.out.println ("Autom�vel est� desligada");
	}
}	
