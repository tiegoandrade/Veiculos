package vehicle;

public class Onibus extends Veiculo {
	
	// Método que liga o veículo e apresenta a mensagem de que ele está ligado.
	// Utiliza o método da superclasse.
	public void ligar(){
		super.ligar();
		System.out.println ("Ônibus está ligado");
	
	}
	
	// Método que desliga o veículo e apresenta a mensagem de que ele está desligado.
	// Utiliza o método da superclasse.
	public void desligar(){
		super.desligar();
		System.out.println ("Ônibus está desligada");
	}
}