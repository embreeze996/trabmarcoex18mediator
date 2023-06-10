package MediatorMethod;

public class Corretora implements Setor {

    private static Corretora instancia = new Corretora();

    private Corretora() {}

    public static Corretora getInstancia() {
        return instancia;
    }

    public String receberReporte(String mensagem) {
        return "O reporte de erro será avaliado e resolvido: " + mensagem;
    }

    public String receberRequisicao(String mensagem) {
        return "Recebemos sua requisição de suporte e um mediador será disponibilizado em breve: " + mensagem;
    }

    public String receberRelatorio(String mensagem) {
        return "Seu relatório fiscal será disponibilizado em breve, agradecemos a preferência: " + mensagem;
    }
}
