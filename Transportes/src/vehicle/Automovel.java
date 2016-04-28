package vehicle;

public class Automovel extends Veiculo {
	
	// Método que liga o veículo e apresenta a mensagem de que ele está ligado.
	// Utiliza o método da superclasse.
	public void ligar(){
		super.ligar();
		System.out.println ("Automóvel está ligado");
	
	}
	// Método que desliga o veículo e apresenta a mensagem de que ele está desligado.
	// Utiliza o método da superclasse.
	public void desligar(){
		super.desligar();
		System.out.println ("Automóvel está desligada");
	}
}	
