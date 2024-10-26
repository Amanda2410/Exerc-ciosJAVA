import java.util.Random;

// Classe abstrata, não pode ser instanciada diretamente.
abstract class Personagem implements Ataque {
    private String nome;
    private int vida;
    private int forca;

    // Construtor para inicializar os atributos de cada personagem.
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    // Métodos públicos para acessar e modificar a vida e força dos personagens.
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = Math.max(vida, 0); // Evita valores negativos para vida.
    }
    public int getForca() {
        return forca;
    }
    public String getNome() {
        return nome;
    }
    // Cada personagem terá seu próprio ataque.
    public abstract void atacar(Personagem p);
    // Implementação metodo curar(), usando um valor aleatório.
    @Override
    public void curar() {
        Random rand = new Random();
        int cura = rand.nextInt(10) + 1; // Gera cura entre 1 e 10.
        setVida(getVida() + cura);
        System.out.println(nome + " se curou em " + cura + " pontos de vida!");
    }
}
