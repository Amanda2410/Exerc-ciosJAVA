public class Caixa extends Pessoa {
    public Caixa(String nome, int identidade, String endereco, int telefone) {
        super(nome, identidade, endereco, telefone);
    }
    public void abrirConta() {
        System.out.println("Conta foi aberta pelo caixa: " + nome);
    }
}
