package vehicle;

public class Onibus extends Veiculo {
	
	public void ligar(){
		super.ligar();
		System.out.println ("Ônibus está ligado");
	
	}
	
	public void desligar(){
		super.desligar();
		System.out.println ("Ônibus está desligada");
	}
}