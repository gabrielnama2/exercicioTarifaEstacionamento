package business;

public class VeiculoEstacionado {
    private Cliente cliente;
    private String tipoVeiculo;
    private int horasEstacionadas;

    public VeiculoEstacionado(Cliente cliente, String tipoVeiculo, int horasEstacionadas) {
        this.cliente = cliente;
        this.tipoVeiculo = tipoVeiculo;
        this.horasEstacionadas = horasEstacionadas;
    }
    
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public int getHorasEstacionadas() {
        return horasEstacionadas;
    }

    public Cliente getCliente() {
        return cliente;
    } 
}
