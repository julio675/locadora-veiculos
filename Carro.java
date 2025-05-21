package projeto;
import java.util.Scanner;

public class Carro extends Veiculo implements Automovel{
	private int qtdPortas;
	private boolean conversivel;
	private Scanner leitor = new Scanner(System.in);

	public Carro(String modelo, String marca, int ano, double precoBase, int qtdPortas, boolean conversivel) {
		super(modelo, marca, ano, precoBase);
		this.qtdPortas = qtdPortas;
		this.conversivel = conversivel;
	}

	@Override
	public double acelerar(double velocidade) {
		return velocidade + 20;
	}

	@Override
	public double frear(double velocidade) {
		return velocidade - 20;
	}

	@Override
	public boolean temMotor() {
		return true;
	}

	@Override
	public String toString() {
		return String.format("Modelo: %s\nMarca: %s\nAno: %d\nPreço: %.2f\nPortas: %d\nConversível: %b\n",
			    getModelo(), getMarca(), getAno(), getPrecoBase(), qtdPortas, conversivel);

	}	
	
}
