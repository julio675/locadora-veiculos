package projeto;

public abstract class Veiculo {
	
	private String modelo;
	private String marca;
	private int ano;
	private double precoBase;
	
	public Veiculo(String modelo, String marca, int ano, double precoBase) {
		super();
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setAno(ano);
		this.setPrecoBase(precoBase);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
}
