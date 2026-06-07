package application;

import domain.Eletronico;
import domain.Frota;
import domain.Intinerario;
import domain.Mobilia;
import domain.Pedido;
import domain.Roteiro;
import domain.Textil;
import java.util.ArrayList;

public class Cadastrador {
    
    private static Cadastrador instance;
    
    private Cadastrador(){
        
    }
    
    public static Cadastrador getInstance(){
        if(instance == null){
            instance = new Cadastrador();
        }return instance;
    }
    
    private final ArrayList<Intinerario> intinerarios = new ArrayList<>();

    private final ArrayList<Frota> frotas = new ArrayList<>();
    
    private final ArrayList<Roteiro> roteiros = new ArrayList<>();
    
    private final ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public void cadastrarIntinerario(Intinerario intinerario) {
        for(Intinerario i : intinerarios){
            if (i.getId() == intinerario.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }            
        }
        intinerarios.add(intinerario);
        System.out.println("Intinerario cadastrado com sucesso");
        
    }

    public ArrayList<Intinerario> getIntinerarios() {
        return intinerarios;
    }
    
    public Intinerario getIntinerarioById(long id) {
        for(Intinerario i : intinerarios){
            if(id == i.getId()){
                return i;
            }
        }
        System.out.println("Intinerario nao encontrado");
        return null;
    }
    
    public void cadastrarFrota(Frota frota){
        for(Frota i : frotas){
            if(i.getNome().equals(frota.getNome())){
                System.out.println("ERRO, FROTA JA CADASTRADA");
                return;
            }
        }
        frotas.add(frota);
        System.out.println("Frota cadastrada com sucesso");
    }

    public ArrayList<Frota> getFrotas() {
        return frotas;
    }


    public Frota getFrotaByName(String nome) {
        for(Frota f : frotas){
            if(nome.equals(f.getNome())){
                return f;
            }
        }
        System.out.println("Frota nao encontrada");
        return null;
    }
        
    public void cadastrarRoteiros(Roteiro roteiro){
        for(Roteiro i : roteiros){
            if(i.getNome().equals(roteiro.getNome())){
                System.out.println("ERRO, LOCALIZACAO JA CADASTRADA");
                return;
            }
        }
        roteiros.add(roteiro);
        System.out.println("Roteiro cadastrado com sucesso");
        
    }

    public ArrayList<Roteiro> getRoteiros() {
        return roteiros;
    }
    
    public Roteiro getRoteiroByName(String nome){
        for(Roteiro r : roteiros){
            if(nome.equals(r.getNome())){
                return r;
            }
        }
        System.out.println("Roteiro nao encontrado");
        return null;
    }
    
    
    public void cadastrarPedido(Eletronico eletronico){
        
        if(eletronico.getTamanho() < 1 || eletronico.getTamanho() > 3){
            System.out.println("ERRO, TAMANHO INVALIDO");
            return;
        }
        
        for(Pedido i : pedidos){
            if(eletronico.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }
        }
        pedidos.add(eletronico);
        System.out.println("Pedido cadastrado com sucesso");
    }
    
    public void cadastrarPedido(Mobilia mobilia){
        
        if(mobilia.getTamanho() < 1 || mobilia.getTamanho() > 3){
            System.out.println("ERRO, TAMANHO INVALIDO");
            return;
        }
        
        for(Pedido i : pedidos){
            if(mobilia.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }
        }
        pedidos.add(mobilia);
        System.out.println("Pedido cadastrado com sucesso");
    }
    
    public void cadastrarPedido(Textil textil){
        
        if(textil.getTamanho() < 1 || textil.getTamanho() > 3){
            System.out.println("ERRO, TAMANHO INVALIDO");
            return;
        }
        
        for(Pedido i : pedidos){
            if(textil.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }
        }
        pedidos.add(textil);
        System.out.println("Pedido cadastrado com sucesso");
    }
    
    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    
    public Pedido getPedidoById(long id){
        for(Pedido p : pedidos){
            if(id == p.getId()){
                return p;
            }
        }
        System.out.println("Pedido nao encontrado");
        return null;
    }    
    
}
