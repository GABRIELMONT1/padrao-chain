package hospital;

public class MedicoCirurgiao extends Medico {

    public MedicoCirurgiao(Medico superior) {
        listaPedidos.add(TipoPedidoCirurgia.getTipoPedidoCirurgia());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Cirurgiao";
    }
}