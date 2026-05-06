package hospital;

public class TipoPedidoExame implements TipoPedido {

    private static TipoPedidoExame tipoPedidoExame = new TipoPedidoExame();
    private TipoPedidoExame() {}

    public static TipoPedidoExame getTipoPedidoExame() {
        return tipoPedidoExame;
    }
}