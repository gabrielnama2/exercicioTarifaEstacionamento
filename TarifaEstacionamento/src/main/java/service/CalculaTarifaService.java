package service;
import business.VeiculoEstacionado;
import java.util.ArrayList;

public class CalculaTarifaService {
    private ArrayList<ICalculoTarifa> calculosTarifa;

    public CalculaTarifaService() {
        this.calculosTarifa = new ArrayList<>();
        this.calculosTarifa.add(new CarroCalculoTarifa());
        this.calculosTarifa.add(new MotoCalculoTarifa());
    }
    
    public void calcular(VeiculoEstacionado veiculoEstacionado){
        for(int i=0; i<this.calculosTarifa.size(); i++){
            this.calculosTarifa.get(i).calcular(veiculoEstacionado);
        }
    }
}
