public class Funcionario extends Pessoa {
    public Funcionario(String nome, int identidade, String endereco, int telefone) {
        super(nome, identidade, endereco, telefone);
    }
    // Metodo para encaminhar solicitação de cancelamento de conta
    public void encaminhaSolicitacaoDeCancelamentoConta() {
        System.out.println("Solicitação de cancelamento de conta foi encaminhada pelo funcionário: " + nome);
    }
    // Metodo para encaminhar solicitação de fechamento de conta
    public void encaminhamentoSolicitacaoDeFechamentoConta() {
        System.out.println("Solicitação de fechamento de conta foi encaminhada pelo funcionário: " + nome);
    }
// Metodo para controlar ocupação de mesa
    public void controlaOcupacaoDeMesa() {
        System.out.println("O funcionário " + nome + " está controlando a ocupação da mesa.");
    }
}
