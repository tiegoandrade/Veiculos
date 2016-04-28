package vehicle;

public class Motocicleta extends Veiculo {
	
	// Método que liga o veículo e apresenta a mensagem de que ele está ligado.
	// Utiliza o método da superclasse.
	public void ligar(){
		super.ligar();
		System.out.println ("Motocicleta está ligado");
	
	}
	
	// Método que desliga o veículo e apresenta a mensagem de que ele está desligado.
	// Utiliza o método da superclasse.
	public void desligar(){
		super.desligar();
		System.out.println ("Motocicleta está desligada");
	}
}
