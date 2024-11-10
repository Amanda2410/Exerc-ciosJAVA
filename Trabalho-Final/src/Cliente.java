public class Cliente extends Pessoa {
    public Cliente(String nome, int identidade, String endereco, int telefone) {
        super(nome, identidade, endereco, telefone);
    }
    public void solicitarCancelamentoConta() {
        System.out.println("Cliente " + nome + " solicitou o cancelamento da conta.");
    }
    public void solicitarFechamentoConta() {
        System.out.println("Cliente " + nome + " solicitou o fechamento da conta.");
    }
    public void selecionarCardapio() {
        System.out.println("Cliente " + nome + " está selecionando o cardápio.");
    }
}
