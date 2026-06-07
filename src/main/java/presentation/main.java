package presentation;

import application.Cadastrador;
import java.util.Scanner;
import domain.Eletronico;
import domain.Frota;
import domain.Intinerario;
import domain.Mobilia;
import domain.Roteiro;
import domain.Textil;

public class main {

    public static void main(String[] args) {

        Cadastrador cad = Cadastrador.getInstance();
        
        
        int opcao;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pedido");
            System.out.println("2 - Cadastrar Frota");
            System.out.println("3 - Cadastrar Roteiro");
            System.out.println("4 - Listar Pedidos");
            System.out.println("5 - Listar Frotas");
            System.out.println("6 - Listar Roteiros");
            System.out.println("7 - Cadastrar Intinerario");
            System.out.println("8 - Listar Intinerarios");
            System.out.println("9 - Alterar status de Intinerario");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                    case 1 -> {
                        // Cadastrar Pedido
                        long pedidoid;
                        System.out.println("Insira um ID numerico unico para o pedido");
                        pedidoid = sc.nextLong();
                    
                        String pedidonome;
                        System.out.println("Insira o nome do pedido");
                        pedidonome = sc.next();
                                   
                        int peso;
                        System.out.println("Insira o tamanho do pedido: ");
                        System.out.println("1 - Pequeno (< 1kg)");
                        System.out.println("2 - Medio (1kg < | < 10kg)");
                        System.out.println("3 - Grande (> 10kg)");
                        peso = sc.nextInt();
                    
                        int pedidotipo;
                        System.out.println("Insira o tipo de pedido: ");
                        System.out.println("1 - Eletronico");
                        System.out.println("2 - Textil");
                        System.out.println("3 - Mobilia");
                        pedidotipo = sc.nextInt();
                    
                    
                        switch (pedidotipo) {
                            case 1 -> {
                                Eletronico ele = new Eletronico(pedidoid, pedidonome, peso);
                                cad.cadastrarPedido(ele);
                            }
                            case 2 -> {
                                Textil tex = new Textil(pedidoid, pedidonome, peso);
                                cad.cadastrarPedido(tex);
                            }
                            case 3 -> {
                                Mobilia mob = new Mobilia(pedidoid, pedidonome, peso);
                                cad.cadastrarPedido(mob);
                            }
                            default -> System.out.println("opcao de pedido invalida");
                        }
                    }
                  
                    case 2 -> {
                        // Cadastrar Frota
                        String frotanome;
                        System.out.println("Insira um nome unico para a frota (sem espacos): ");
                        frotanome = sc.next();
                        
                        int frotatamanho;
                        System.out.println("Insira o numero de trabalhadores suportado pela frota: ");
                        frotatamanho = sc.nextInt();
                        
                        Frota fro = new Frota(frotanome, frotatamanho);
                        cad.cadastrarFrota(fro);
                        
                    }

                    case 3 -> {
                        // Cadastrar Roteiro
                        String roteironome;
                        System.out.println("Insira um nome unico para a localizacao registrada (sem espacos): ");
                        roteironome = sc.next();
                        
                        double distancia;
                        System.out.println("Insira em quilometros a distancia da localizacao para a sede: ");
                        distancia = sc.nextDouble();
                        
                        Roteiro rot = new Roteiro(roteironome, distancia);
                        cad.cadastrarRoteiros(rot);
                    }

                    case 4 -> {
                        // Listar Pedidos
                    }

                    case 5 -> {
                        // Listar Frotas
                    }

                    case 6 -> {
                        // Listar Roteiros
                    }

                    case 7 -> {
                        // Cadastrar Intinerario
                    }

                    case 8 -> {
                        // Listar Intinerarios
                    }
                
                    case 9 -> {
                        // Alterar status de Intinerario
                    }
                    
                    case 10 -> {
                        System.out.println("Encerrando o sistema...");
                        sc.close();
                    }

                    default -> System.out.println("Opção inválida!");
            }
            
        } while (opcao != 10);

    }
}
        
  
