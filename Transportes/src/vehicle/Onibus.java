package vehicle;

public class Onibus extends Veiculo {
	
	public void ligar(){
		super.ligar();
		System.out.println ("�nibus est� ligado");
	
	}
	
	public void desligar(){
		super.desligar();
		System.out.println ("�nibus est� desligada");
	}
}