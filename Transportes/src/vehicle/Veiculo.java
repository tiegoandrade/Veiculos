package vehicle;

public class Veiculo {
	
	// Atributo da classe.
	private boolean ligado;
	
	// M�todo que ser� sobrescrito.
	public void ligar(){
		ligado = true;
	}
	
	// M�todo que ser� sobrescrito.
	public void desligar(){
		ligado = false;
	}
	
	// M�todo getter que apresenta o valor do atributo.
	public boolean isLigado() {
		return ligado;
	}
}
