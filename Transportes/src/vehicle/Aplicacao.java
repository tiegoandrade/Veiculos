package vehicle;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria��o de um objeto e apresenta��o do valor do atributo.
		Veiculo a1 = new Automovel();
		a1.ligar();
		System.out.println(a1.isLigado());
		a1.desligar();
		System.out.println(a1.isLigado());
		
		// Cria��o de um objeto e apresenta��o do valor do atributo.
		Veiculo m1 = new Motocicleta();
		System.out.println();
		m1.ligar();
		System.out.println(m1.isLigado());
		m1.desligar();
		System.out.println(m1.isLigado());
		
		// Cria��o de um objeto e apresenta��o do valor do atributo.
		Veiculo o1 = new Onibus();
		System.out.println();
		o1.ligar();
		System.out.println(o1.isLigado());
		o1.desligar();
		System.out.println(o1.isLigado());
		

	}

}
