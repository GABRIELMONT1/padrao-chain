package hospital;

import java.util.ArrayList;

public abstract class Medico {

    protected ArrayList listaPedidos = new ArrayList();
    private Medico medicoSuperior;

    public Medico getMedicoSuperior() {
        return medicoSuperior;
    }

    public void setMedicoSuperior(Medico medicoSuperior) {
        this.medicoSuperior = medicoSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipoPedido())) {
            return getDescricaoCargo();
        } else {
            if (medicoSuperior != null) {
                return medicoSuperior.aprovarPedido(pedido);
            } else {
                return "Sem aprovacao";
            }
        }
    }
}