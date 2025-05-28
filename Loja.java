package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.time.Year;

// Classe que representa a loja de locação de veículos
public class Loja {
    private ArrayList<Veiculo> motos = new ArrayList<>();
    private ArrayList<Veiculo> carros = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Método para exibir o menu principal
    public void menu() {
        String op;
        do {
            System.out.printf("1. Alugar Veículo\n0. Sair\n--> ");
            op = sc.nextLine();

            switch (op) {
                case "1":
                    menuAlugar();
                    break;
                case "0":
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!op.equals("0"));
    }

    // Menu para alugar veículo
    public void menuAlugar() {
        String op;
        System.out.printf("========== ALUGAR ==========\n\n1. Carro\n2. Moto\n0. Voltar\n\n--> ");
        op = sc.nextLine();

        switch (op) {
            case "1":
                alugarVeiculo(carros);
                break;
            case "2":
                alugarVeiculo(motos);
                break;
            case "0":
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Método para alugar veículo
    public void alugarVeiculo(ArrayList<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo disponível para aluguel.");
            return;
        }

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);
            System.out.printf("ID: %d\n%s\nPreço Atual: R$%.2f\n\n", i, v.toString(), calcularPreco(v));
        }

        System.out.print("Digite o ID do veículo que deseja alugar: ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            if (id >= 0 && id < veiculos.size()) {
                Veiculo veiculoAlugado = veiculos.remove(id);
                System.out.println("Veículo alugado com sucesso:\n" + veiculoAlugado.toString());
            } else {
                System.out.println("ID inválido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }

    // Método para calcular o preço com base no ano e tipo do veículo
    public double calcularPreco(Veiculo veiculo) {
        String veiculoTipo = veiculo.getVeiculoTipo();
        int ano = veiculo.getAno();
        double precoBase = veiculo.getPrecoBase();

        int taxa = 0;
        if (veiculoTipo.equals("moto")) {
            taxa = 15;
        } else if (veiculoTipo.equals("carro")) {
            taxa = 10;
        }

        return precoBase * Math.pow((1 - (taxa / 100.0)), Year.now().getValue() - ano);
    }

    // Método para calcular serviços extras
    public double calcularServicoExtra(String tipoServico) {
        switch (tipoServico.toLowerCase()) {
            case "seguro":
                return 5000;
            case "tanque cheio":
                return 500;
            case "condutor adicional":
                return 1000;
            default:
                System.out.println("Serviço inválido ou inexistente.");
                return 0;
        }
    }

    // Método para cadastrar uma nova moto
    public void cadastrarMoto() {
        System.out.println("Cadastro de Moto:");
        try {
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Ano: ");
            int ano = Integer.parseInt(sc.nextLine());
            System.out.print("Preço Base: ");
            double preco = Double.parseDouble(sc.nextLine());
            System.out.print("Cilindradas: ");
            int cc = Integer.parseInt(sc.nextLine());
            System.out.print("Tipo: ");
            String tipo = sc.nextLine();

            Moto moto = new Moto(modelo, marca, ano, preco, cc, tipo);
            motos.add(moto);
            System.out.println("Moto cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir números nos campos apropriados.");
        }
    }
}
