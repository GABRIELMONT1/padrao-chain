package hospital;

public class MedicoResidente extends Medico {

    public MedicoResidente(Medico superior) {
        listaPedidos.add(TipoPedidoExame.getTipoPedidoExame());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Residente";
    }
}