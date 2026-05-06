package hospital;

public class MedicoEspecialista extends Medico {

    public MedicoEspecialista(Medico superior) {
        listaPedidos.add(TipoPedidoConsulta.getTipoPedidoConsulta());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Especialista";
    }
}