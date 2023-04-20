package business;
import java.time.LocalDate;

public class Tarifa {
    private String tipoVeiculo;
    private int horasEstacionadas;
    private double valorTarifa;
    private LocalDate data; 

    public Tarifa(String tipoVeiculo, int horasEstacionadas, double valorTarifa) {
        this.tipoVeiculo = tipoVeiculo;
        this.horasEstacionadas = horasEstacionadas;
        this.valorTarifa = valorTarifa;
        this.data = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tarifa{" + "tipoVeiculo=" + tipoVeiculo + ", horasEstacionadas=" + horasEstacionadas + ", valorTarifa=" + valorTarifa + " R$ , data=" + data + '}';
    } 
}
