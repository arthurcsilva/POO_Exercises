package main;

import domain.Veiculo;

import java.util.Scanner;

public class MainVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        Veiculo veiculo = new Veiculo("DHK7H39", "Mercedes-Benz", "Truck", 210, 500);

        do {
           exibirMenu();
            System.out.println("Digite a opção desejada: ");
           option = sc.nextInt();

           switch (option) {
               case 1:
                   System.out.println(veiculo.exibirInfo());
                   break;
               case 2:
                   System.out.println("Digite a quantidade de litros para abastecer: ");
                   System.out.println(veiculo.abastecer(sc.nextDouble()));
                   break;
               case 3:
                   System.out.println("Digite a distância a percorrer: ");
                   double distancia = sc.nextDouble();
                   System.out.println("Digite o consumo do veículo: ");
                   double consumo = sc.nextDouble();
                   if (veiculo.viajar(distancia, consumo)) {
                       System.out.println("Viagem realizada com sucesso!");
                       System.out.println("Combustivel restante: " + veiculo.getQtdCombustivelAtual() + " litros.");
                   } else {
                       System.out.println("Combustível insuficiente para realizar a viagem.");
                   }
                   break;
               case 4:
                   System.out.println("Obrigado por utilizar nossa ferramenta, até logo.");
                   break;
               default:
                   System.out.println("Opção inválida, por favor escolha uma opção válida.");
           }

        } while (option != 4);

        sc.close();
    }
    public static void exibirMenu(){
        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1 - Exibir Informação do Veículo");
        System.out.println("2 - Abastecer veículo");
        System.out.println("3 - Viajar");
        System.out.println("4 - Sair");
    }
}
