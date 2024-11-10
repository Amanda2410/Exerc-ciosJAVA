public class Pessoa {
    protected String nome;
    protected int identidade;
    protected String endereco;
    protected int telefone;
    // Atributos protegidos (protected) para que classes filhas possam acessá-los

    public Pessoa(String nome, int identidade, String endereco, int telefone) {
        this.nome = nome;
        this.identidade = identidade;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }
    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter para o atributo identidade
    public int getIdentidade() {
        return identidade;
    }
    // Setter para o atributo identidade
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }
    // Getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }
    // Setter para o atributo endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // Getter para o atributo telefone
    public int getTelefone() {
        return telefone;
    }
    // Setter para o atributo telefone
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
