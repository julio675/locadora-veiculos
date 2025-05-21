package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	/* private ArrayList<Veiculo> disponiveis = new ArrayList<>();
    private ArrayList<Veiculo> alugados = new ArrayList<>();
    private ArrayList<Veiculo> vendidos = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void cadastrarVeiculo() {
        System.out.println("\nQual tipo de veículo deseja cadastrar?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Bicicleta");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        sc.nextLine(); // limpar buffer

        switch (escolha) {
            case 1:
                cadastrarCarro();
                break;
            case 2:
                cadastrarMoto();
                break;
            case 3:
                 System.out.println("ddd");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }*/

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
	
	 /*   public void cadastrarCarro() {
	        System.out.println("\nCadastro de carro:");
		String modelo; 
		String marca;
		int ano;
		double preco;
		int portas;
		boolean conversivel;
		String conversivel;
		
	        System.out.print("Modelo: ");
	        modelo = sc.nextLine(); 
	        System.out.print("Marca: ");
	        marca = sc.nextLine();
	        System.out.print("Ano: ");
	        ano = sc.nextInt();
	        System.out.print("Preço base: ");
	        preco = sc.nextDouble();
	        System.out.print("Quantidade de portas: ");
	        portas = sc.nextInt();
	        System.out.print("É conversível (true/false): ");
	        conversivel = sc.nextBoolean();
	        sc.nextLine(); // limpar buffer
	        System.out.print("Tipo de combustível: ");
	        combustivel = sc.nextLine();
	
	        Carro carro = new Carro(modelo, marca, ano, preco, portas, conversivel, combustivel);
	        disponiveis.add(carro);
	        System.out.println("Carro cadastrado com sucesso!\n");
	    }*/
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
