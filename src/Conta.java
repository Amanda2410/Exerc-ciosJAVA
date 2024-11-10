import java.util.Date;
import java.util.Random;

public class Conta {
    private int garcom;
    private Date dataAbertura;
    private Date dataFechamento;
    private double valorTotal; // Armazena o valor total da conta

    public Conta(int garcom, Date dataAbertura, Date dataFechamento) {
        this.garcom = garcom;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.valorTotal = gerarValorAleatorio(); // Gera um valor aleatório para a conta
    }
    // Metodo para gerar um valor aleatório para a conta
    private double gerarValorAleatorio() {
        Random random = new Random();
        return 50 + (300 - 50) * random.nextDouble(); // Valor entre 50 e 500 reais
    }
    public void exibirValorTotal() {
        System.out.println("Valor total da conta: R$ " + valorTotal);
    }
    public void avisarCancelamento() {
        System.out.println("A conta foi cancelada.");
    }
    public Date getdataFechamento() {
        return dataFechamento;
    }
    public Date getdataAbertura() {
        return dataAbertura;
    }
    public int getGarcom(){
        return garcom;
    }
    public void setGarcom(int garcom) {
        this.garcom = garcom;
    }
}
