package presentation;

import application.Cadastrador;
import java.util.Scanner;
import domain.Eletronico;
import domain.Frota;
import domain.Intinerario;
import domain.Roteiro;

public class main {

    public static void main(String[] args) {

        Cadastrador cad = Cadastrador.getInstance();
        
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pedido");
            System.out.println("2 - Cadastrar Frota");
            System.out.println("3 - Cadastrar Roteiro");
            System.out.println("4 - Listar Pedidos");
            System.out.println("5 - Listar Frotas");
            System.out.println("6 - Listar Roteiros");
            System.out.println("7 - Cadastrar Itinerário");
            System.out.println("8 - Listar Itinerários");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar Pedido
                    break;

                case 2:
                    // Cadastrar Frota
                    break;

                case 3:
                    // Cadastrar Roteiro
                    break;

                case 4:
                    // Listar Pedidos
                    break;

                case 5:
                    // Listar Frotas
                    break;

                case 6:
                    // Listar Roteiros
                    break;

                case 7:
                    // Cadastrar Itinerário
                    break;

                case 8:
                    // Listar Itinerários
                    break;

                case 9:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);

        sc.close();
    }
}
        
  
