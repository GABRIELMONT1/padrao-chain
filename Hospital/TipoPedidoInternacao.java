package hospital;

public class TipoPedidoInternacao implements TipoPedido {

    private static TipoPedidoInternacao tipoPedidoInternacao = new TipoPedidoInternacao();
    private TipoPedidoInternacao() {}

    public static TipoPedidoInternacao getTipoPedidoInternacao() {
        return tipoPedidoInternacao;
    }
}