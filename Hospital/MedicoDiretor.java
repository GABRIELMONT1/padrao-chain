package hospital;

public class MedicoDiretor extends Medico {

    public MedicoDiretor(Medico superior) {
        listaPedidos.add(TipoPedidoInternacao.getTipoPedidoInternacao());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}