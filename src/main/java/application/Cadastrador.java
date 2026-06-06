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
            }else{
                intinerarios.add(intinerario);
            }
        }
        
    }

    public ArrayList<Intinerario> getIntinerarios() {
        return intinerarios;
    }
    
    public void cadastrarFrota(Frota frota){
        for(Frota i : frotas){
            if(i.getNome().equals(frota.getNome())){
                System.out.println("ERRO, FROTA JA CADASTRADA");
                return;
            }else{
                frotas.add(frota);
            }
        }
    }

    public ArrayList<Frota> getFrotas() {
        return frotas;
    }
    
    public void cadastrarRoteiros(Roteiro roteiro){
        for(Roteiro i : roteiros){
            if(i.getNome().equals(roteiro.getNome())){
                System.out.println("ERRO, LOCALIZACAO JA CADASTRADA");
                return;
            }else{
                roteiros.add(roteiro);
            }
        }
        
    }

    public ArrayList<Roteiro> getRoteiros() {
        return roteiros;
    }
    
    public void cadastrarPedido(Eletronico eletronico){
        for(Pedido i : pedidos){
            if(eletronico.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }else{
                pedidos.add(eletronico);
            }
        }
    }
    
    public void cadastrarPedido(Mobilia mobilia){
        for(Pedido i : pedidos){
            if(mobilia.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }else{
                pedidos.add(mobilia);
            }
        }
    }
    
    public void cadastrarPedido(Textil textil){
        for(Pedido i : pedidos){
            if(textil.getId() == i.getId()){
                System.out.println("ERRO, ID JA CADASTRADO");
                return;
            }else{
                pedidos.add(textil);
            }
        }
    }
    
    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    
}
