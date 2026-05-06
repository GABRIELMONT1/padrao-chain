package hospital;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTeste {

    MedicoDiretor diretor;
    MedicoCirurgiao cirurgiao;
    MedicoEspecialista especialista;
    MedicoResidente residente;

    @BeforeEach
    void setUp() {
        diretor = new MedicoDiretor(null);
        cirurgiao = new MedicoCirurgiao(diretor);
        especialista = new MedicoEspecialista(cirurgiao);
        residente = new MedicoResidente(especialista);
    }

    @Test
    void deveRetornarResidenteParaExame() {
        assertEquals("Residente", residente.aprovarPedido(new Pedido(TipoPedidoExame.getTipoPedidoExame())));
    }

    @Test
    void deveRetornarEspecialistaParaConsulta() {
        assertEquals("Especialista", residente.aprovarPedido(new Pedido(TipoPedidoConsulta.getTipoPedidoConsulta())));
    }

    @Test
    void deveRetornarCirurgiaoParaCirurgia() {
        assertEquals("Cirurgiao", residente.aprovarPedido(new Pedido(TipoPedidoCirurgia.getTipoPedidoCirurgia())));
    }

    @Test
    void deveRetornarDiretorParaInternacao() {
        assertEquals("Diretor", residente.aprovarPedido(new Pedido(TipoPedidoInternacao.getTipoPedidoInternacao())));
    }

    @Test
    void deveRetornarSemAprovacaoParaEmergencia() {
        assertEquals("Sem aprovacao", residente.aprovarPedido(new Pedido(TipoPedidoEmergencia.getTipoPedidoEmergencia())));
    }
}