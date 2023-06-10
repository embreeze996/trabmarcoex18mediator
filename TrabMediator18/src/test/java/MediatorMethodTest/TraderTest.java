package MediatorMethodTest;

import MediatorMethod.Trader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TraderTest {

    @Test
    void deveReportarErro() {
        Trader trader = new Trader();
        assertEquals("A Corretora Trinance agradece seu feedback.\nO suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O reporte de erro será avaliado e resolvido: Botão não funcional para alterar compras",
                trader.reportarErro("Botão não funcional para alterar compras"));
    }

    @Test
    void deveRequisitarSuporteTransacao() {
        Trader trader = new Trader();
        assertEquals("A Corretora Trinance agradece seu feedback.\nO suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>Recebemos sua requisição de suporte e um mediador será disponibilizado em breve: Auxílio para transação P2P",
                trader.requerirSuporteTransacao("Auxílio para transação P2P"));
    }

    @Test
    void deveSolicitarRelatorioFiscal() {
       Trader trader = new Trader();
        assertEquals("A Corretora Trinance agradece seu feedback.\nO suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>Seu relatório fiscal será disponibilizado em breve, agradecemos a preferência: O arquivo do relatório fiscal foi enviado para seu e-mail",
                trader.solicitarRelatorioFiscal("O arquivo do relatório fiscal foi enviado para seu e-mail"));
    }

}
