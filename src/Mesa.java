import java.util.Date;

public class Mesa {
    private final Date dataOcupacao;

    public Mesa(Date dataOcupacao) {
        this.dataOcupacao = dataOcupacao;
    }
    public void gerarRelatorioDeOcupacao() {
        System.out.println("Relatório de ocupação da mesa: Data - " + dataOcupacao);
    }
}
