package MediatorMethod;

public class Pessoa {

    public String reportarErro(String mensagem) {
        return SuporteCliente.getInstancia().receberReporteErro(mensagem);
    }

    public String requerirSuporteTransacao(String mensagem) {
        return SuporteCliente.getInstancia().receberRequisicaoSuporteTransacao(mensagem);
    }

    public String solicitarRelatorioFiscal(String mensagem) {
        return SuporteCliente.getInstancia().receberSolicitacaoRelatorioFiscal(mensagem);
    }


}