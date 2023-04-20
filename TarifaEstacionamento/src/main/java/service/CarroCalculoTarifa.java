package service;

import business.Tarifa;
import business.VeiculoEstacionado;

public class CarroCalculoTarifa implements ICalculoTarifa{
    
    @Override
    public void calcular(VeiculoEstacionado veiculoEstacionado) {
        double descontoPreferencial = 1;
        if(veiculoEstacionado.getCliente().getPreferencial()){
            descontoPreferencial = 0.7;
        }
        if(veiculoEstacionado.getTipoVeiculo() == "carro"){
            if(veiculoEstacionado.getHorasEstacionadas() > 0 && veiculoEstacionado.getHorasEstacionadas() <=4){
                veiculoEstacionado.getCliente().addTarifa(new Tarifa("Carro", veiculoEstacionado.getHorasEstacionadas(), 5.00 * descontoPreferencial));
            }
            else if(veiculoEstacionado.getHorasEstacionadas() > 4 && veiculoEstacionado.getHorasEstacionadas() <=12){
                veiculoEstacionado.getCliente().addTarifa(new Tarifa("Carro", veiculoEstacionado.getHorasEstacionadas(), 20.00 * descontoPreferencial));
            }
            else if(veiculoEstacionado.getHorasEstacionadas() > 12 && veiculoEstacionado.getHorasEstacionadas() <=24){
                veiculoEstacionado.getCliente().addTarifa(new Tarifa("Carro", veiculoEstacionado.getHorasEstacionadas(), 40.00 * descontoPreferencial));
            }
        }
    }
}
