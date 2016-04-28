package vehicle;

public class Veiculo {
	
	// Atributo da classe.
	private boolean ligado;
	
	// Método que será sobrescrito.
	public void ligar(){
		ligado = true;
	}
	
	// Método que será sobrescrito.
	public void desligar(){
		ligado = false;
	}
	
	// Método getter que apresenta o valor do atributo.
	public boolean isLigado() {
		return ligado;
	}
}
