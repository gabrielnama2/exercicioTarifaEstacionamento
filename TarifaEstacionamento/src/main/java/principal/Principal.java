package principal;
import service.CalculaTarifaService;
import business.Cliente;
import business.VeiculoEstacionado;

public class Principal {

    public static void main(String[] args) {
        Cliente motorista = new Cliente("Motorista", true);
        Cliente motoboy = new Cliente("Motoboy", false);
        VeiculoEstacionado carro = new VeiculoEstacionado(motorista, "carro", 10);
        VeiculoEstacionado moto = new VeiculoEstacionado(motoboy, "moto", 5);
        CalculaTarifaService calculaTarifa = new CalculaTarifaService();
        calculaTarifa.calcular(carro);
        calculaTarifa.calcular(moto);
        System.out.println(motorista.getTodasTarifas().toString());
        System.out.println(motoboy.getTodasTarifas().toString());
    }
}
