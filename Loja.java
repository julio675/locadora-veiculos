package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	
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
	
	public void cadastrarMoto(ArrayList<Moto> motos) {
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
	
	public void cadastrarCarro(ArrayList<Carro> carros) {
		
	}
}
