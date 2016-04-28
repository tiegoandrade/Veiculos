package vehicle;

public class Motocicleta extends Veiculo {
	
	public void ligar(){
		super.ligar();
		System.out.println ("Motocicleta está ligado");
	
	}
	
	public void desligar(){
		super.desligar();
		System.out.println ("Motocicleta está desligada");
	}
}
