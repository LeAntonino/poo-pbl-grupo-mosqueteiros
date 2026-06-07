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
                        try{
                        System.out.println("Insira um ID numerico unico para o pedido");
                        long pedidoid = sc.nextLong();
                    
                        String pedidonome;
                        System.out.println("Insira o nome do pedido");
                        pedidonome = sc.next();
                                   
                        System.out.println("Insira o tamanho do pedido: ");
                        System.out.println("1 - Pequeno (< 1kg)");
                        System.out.println("2 - Medio (1kg < | < 10kg)");
                        System.out.println("3 - Grande (> 10kg)");
                        int peso = sc.nextInt();
                    
                        System.out.println("Insira o tipo de pedido: ");
                        System.out.println("1 - Eletronico");
                        System.out.println("2 - Textil");
                        System.out.println("3 - Mobilia");
                        int pedidotipo = sc.nextInt();
                    
                    
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
                        }catch(Exception e){
                            System.out.println("valor invalido inserido");
                        }
                    }
                  
                    case 2 -> {
                        // Cadastrar Frota
                        try{
                        System.out.println("Insira um nome unico para a frota (sem espacos): ");
                        String frotanome = sc.next();
                        
                        System.out.println("Insira o numero de trabalhadores suportado pela frota: ");
                        int frotatamanho = sc.nextInt();
                        
                        Frota fro = new Frota(frotanome, frotatamanho);
                        cad.cadastrarFrota(fro);
                        }catch(Exception e){
                            System.out.println("valor invalido inserido");
                        }
                    }

                    case 3 -> {
                        // Cadastrar Roteiro
                        try{
                        System.out.println("Insira um nome unico para a localizacao registrada (sem espacos): ");
                        String roteironome = sc.next();
                        
                        System.out.println("Insira em quilometros a distancia da localizacao para a sede: ");
                        double distancia = sc.nextDouble();
                        
                        Roteiro rot = new Roteiro(roteironome, distancia);
                        cad.cadastrarRoteiros(rot);
                        }catch(Exception e){
                            System.out.println("valor invalido inserido");
                        }
                    }

                    case 4 -> {
                        // Listar Pedidos
                        System.out.println("==== LISTA DE PEDIDOS ====");
                        cad.listarPedidos();
                        
                    }

                    case 5 -> {
                        // Listar Frotas
                        System.out.println("==== LISTA DE FROTAS ====");
                        cad.listarFrotas();
                    }

                    case 6 -> {
                        // Listar Roteiros
                        System.out.println("==== LISTA DE ROTEIROS ====");
                        cad.listarRoteiros();
                    }

                    case 7 -> {
                        // Cadastrar intinerarios
                        try{
                            
                            System.out.println("Insira um ID numerico unico para o intinerario: ");
                            long idInti = sc.nextLong();
                            
                            System.out.println("Insira o nome do roteiro que pertencera a esse intinerario: ");
                            String nomerot = sc.next();
                            Roteiro rot = cad.getRoteiroByName(nomerot);
                            if (rot == null){break;}
                            
                            System.out.println("Insira o nome da frota que pertencera a esse intinerario: ");
                            String nomefro = sc.next();
                            Frota fro = cad.getFrotaByName(nomefro);
                            if (fro == null){break;}
                            
                            System.out.println("Insira o ID do pedido que sera entregue neste intinerario: ");
                            long idped = sc.nextLong();
                            var ped = cad.getPedidoById(idped);
                            if (ped == null){break;}
                            
                            if(ped instanceof Eletronico eletronico){
                            Intinerario inti = new Intinerario(idInti, rot, fro, eletronico);
                            cad.cadastrarIntinerario(inti);
                            }
                            if(ped instanceof Textil textil){
                            Intinerario inti = new Intinerario(idInti, rot, fro, textil);
                            cad.cadastrarIntinerario(inti);
                            }
                            if(ped instanceof Mobilia mobilia){
                            Intinerario inti = new Intinerario(idInti, rot, fro, mobilia);
                            cad.cadastrarIntinerario(inti);
                            }                  
                            
                        }catch(Exception e){
                            System.out.println("valor invalido inserido");
                        }
                    }

                    case 8 -> {
                        // Listar Intinerarios
                        System.out.println("==== LISTA DE INTINERARIOS ====");
                        cad.listarIntinerarios();
                    }
                
                    case 9 -> {
                        // Alterar status de Intinerario
                        try{
                            long idinti;
                            System.out.println("Insira o ID do Intinerario");
                            idinti = sc.nextLong();
                            
                            cad.getIntinerarioById(idinti).setStatus(true);
                        }catch(Exception e){
                            
                        }
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
        
  
