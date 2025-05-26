package locadora_veiculos;

public class Moto extends Veiculo implements Automovel{
	
	private int cc;
	private String tipo;
	
	public Moto(String modelo, String marca, int ano, double precoBase, int cc, String tipo) {
		super(modelo,marca,ano,precoBase);
		this.cc = cc;
		this.tipo = tipo;
		setVeiculoTipo("moto");
	}

	public int getCc() {
		return cc;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
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
