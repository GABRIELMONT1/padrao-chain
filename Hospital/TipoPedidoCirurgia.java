package hospital;

public class TipoPedidoCirurgia implements TipoPedido {

    private static TipoPedidoCirurgia tipoPedidoCirurgia = new TipoPedidoCirurgia();
    private TipoPedidoCirurgia() {}

    public static TipoPedidoCirurgia getTipoPedidoCirurgia() {
        return tipoPedidoCirurgia;
    }
}