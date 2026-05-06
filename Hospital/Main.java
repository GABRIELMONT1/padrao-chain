package hospital;

public class Main {
    public static void main(String[] args) {

        MedicoDiretor diretor = new MedicoDiretor(null);
        MedicoCirurgiao cirurgiao = new MedicoCirurgiao(diretor);
        MedicoEspecialista especialista = new MedicoEspecialista(cirurgiao);
        MedicoResidente residente = new MedicoResidente(especialista);

        System.out.println(residente.aprovarPedido(new Pedido(TipoPedidoExame.getTipoPedidoExame())));
        System.out.println(residente.aprovarPedido(new Pedido(TipoPedidoConsulta.getTipoPedidoConsulta())));
        System.out.println(residente.aprovarPedido(new Pedido(TipoPedidoCirurgia.getTipoPedidoCirurgia())));
        System.out.println(residente.aprovarPedido(new Pedido(TipoPedidoInternacao.getTipoPedidoInternacao())));
        System.out.println(residente.aprovarPedido(new Pedido(TipoPedidoEmergencia.getTipoPedidoEmergencia())));
    }
}