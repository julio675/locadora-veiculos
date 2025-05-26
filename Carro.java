package locadora_veiculos;

public class Carro extends Veiculo implements Automovel {
	
	final String veiculoTipo = "moto";
	
	public Carro(String modelo, String marca, int ano, double precoBase) {
		super(modelo,marca,ano,precoBase);
		setVeiculoTipo("carro");
	}
	
	public double acelerar(double velocidade) {
		return velocidade+20;
	}

	@Override
	public double frear(double velocidade) {
		return velocidade-20;
	}

	@Override
	public boolean temMotor() {
		return true;
	}
}
