package hospital;

public class TipoPedidoEmergencia implements TipoPedido {

    private static TipoPedidoEmergencia tipoPedidoEmergencia = new TipoPedidoEmergencia();
    private TipoPedidoEmergencia() {}

    public static TipoPedidoEmergencia getTipoPedidoEmergencia() {
        return tipoPedidoEmergencia;
    }
}