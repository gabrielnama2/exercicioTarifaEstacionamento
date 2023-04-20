package business;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private boolean preferencial;
    private ArrayList<Tarifa> todasTarifas;

    public Cliente(String nome, boolean preferencial) {
        this.nome = nome;
        this.preferencial = preferencial;
        this.todasTarifas = new ArrayList<>();
    }

    public void addTarifa(Tarifa tarifa){
        this.todasTarifas.add(tarifa);
    }
    
    public String getNome() {
        return nome;
    }

    public boolean getPreferencial() {
        return preferencial;
    }

    public ArrayList<Tarifa> getTodasTarifas() {
        return todasTarifas;
    }
}
