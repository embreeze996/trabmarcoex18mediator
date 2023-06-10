package MediatorMethod;
public class SuporteCliente {

    private static SuporteCliente instancia = new SuporteCliente();

    private SuporteCliente() {}

    public static SuporteCliente getInstancia() {
        return instancia;
    }

    public String receberReporteErro (String mensagem) {
        return "A Corretora Trinance agradece seu feedback.\n"+
                "O suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Corretora.getInstancia().receberReporte(mensagem);
    }

    public String receberRequisicaoSuporteTransacao(String mensagem) {
        return "A Corretora Trinance agradece seu feedback.\n"+
                "O suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Corretora.getInstancia().receberRequisicao(mensagem);
    }

    public String receberSolicitacaoRelatorioFiscal(String mensagem) {
        return "A Corretora Trinance agradece seu feedback.\n"+
                "O suporte ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Corretora.getInstancia().receberRelatorio(mensagem);
    }

}