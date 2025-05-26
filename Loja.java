package locadora_veiculos;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.time.Year;
public class Loja {
	
	private ArrayList<Veiculo> motos = new ArrayList<Veiculo>();
	private ArrayList<Veiculo> carros = new ArrayList<Veiculo>();
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		String op;
		System.out.printf("1. Alugar Veículo\n0. Sair\n--> ");
		op = sc.nextLine();
		
		switch(op) {
			case "1":
				menuAlugar(); break;
			case "0":
				break;
			default:
				menu(); break;
		}
	}
	
	public void menuAlugar() {
		
		String op;
		System.out.printf("========== ALUGAR ==========\n\n1. Carro\n2. Moto\n0. Sair\n\n-->");	
		op = sc.nextLine();
		
		switch(op) {
		case "1": 
			alugarVeiculo(carros); break;
		case "2":
			alugarVeiculo(motos); break;
		case "0":
			menu(); break;
		default:
			menuAlugar(); break;
		}
	}
	
	public void alugarVeiculo(ArrayList<Veiculo> veiculos) {
		for(int i = 0; i < veiculos.size(); i = i + 1) {
			System.out.printf(veiculos.get(i).toString());
			System.out.println("\nPreco Atual: " + Math.round(calcularPreco(veiculos.get(i))) + "\n\n");
		}
	}
	
	public double calcularPreco(Veiculo veiculo) {
		String veiculoTipo = veiculo.getVeiculoTipo();
		double ano = veiculo.getAno();
		double precoBase = veiculo.getPrecoBase();

		int taxa = 0;
		if(veiculoTipo.equals("moto") == true) {
			taxa = 15;
		} else if(veiculoTipo.equals("carro") == true) {
			taxa = 10;
		}
		
		return precoBase * Math.pow((1 - (taxa/100.0)), Year.now().getValue() - ano);
	}
	
	public double calcularServicoExtra(String tipoServico) {
		if(tipoServico.equalsIgnoreCase("seguro")) {
			return 5000;
		}
		else if(tipoServico.equalsIgnoreCase("tanque cheio")) {
			return 500;
		}
		else if(tipoServico.equalsIgnoreCase("condutor adicional")) {
			return 1000;
		}
		else {
			System.out.println("Serviço invalido ou inesxistente.");
			return 0;
		}
	}
	
	public void cadastrarMoto() {
		Scanner sc = new Scanner(System.in);
		
		String modelo;
		String marca;
		int ano;
		double preco;
		int cc;
		String tipo;
		
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		System.out.println("Marca: ");
		marca = sc.nextLine();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		System.out.println("Preço: ");
		preco = sc.nextDouble();
		System.out.println("Cilindradas: ");
		cc = sc.nextInt();
		System.out.println("Tipo: ");
		tipo = sc.nextLine();
		
		Moto moto = new Moto(modelo,marca,ano,preco,cc,tipo);
		
		motos.add(moto);
		sc.close();
	}
	
	public void cadastrarCarro() {
		Scanner sc = new Scanner(System.in);
		
		String modelo;
		String marca;
		int ano;
		double preco;
		
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		System.out.println("Marca: ");
		marca = sc.nextLine();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		System.out.println("Preço: ");
		preco = sc.nextDouble();
		
		Carro moto = new Carro(modelo,marca,ano,preco);
		
		carros.add(moto);
		sc.close();
	}
	
	public void cadastroInicial() {
		carros.add(new Carro("Corolla", "Toyota", 2025, 164590));
		carros.add(new Carro("KING GS", "BYD", 2025, 191900));
		carros.add(new Carro("FUSCA 1600", "Volkswagen", 1984, 3000000));
		
		motos.add(new Moto("CG 170 Titan", "Honda", 2024, 190520, 163, "OHC"));
		motos.add(new Moto("BIZ 125 ES", "Honda", 2025, 12500, 124, "Motoneta"));
		motos.add(new Moto("HAYABUSA", "Suzuki", 2025, 124500, 1340, "Esportiva"));
		
	}
}
