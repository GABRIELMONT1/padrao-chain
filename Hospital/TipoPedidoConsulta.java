package hospital;

public class TipoPedidoConsulta implements TipoPedido {

    private static TipoPedidoConsulta tipoPedidoConsulta = new TipoPedidoConsulta();
    private TipoPedidoConsulta() {}

    public static TipoPedidoConsulta getTipoPedidoConsulta() {
        return tipoPedidoConsulta;
    }
}