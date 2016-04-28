package vehicle;

public class Automovel extends Veiculo {
	
	public void ligar(){
		super.ligar();
		System.out.println ("Automóvel está ligado");
	
	}
	
	public void desligar(){
		super.desligar();
		System.out.println ("Automóvel está desligada");
	}
}	
