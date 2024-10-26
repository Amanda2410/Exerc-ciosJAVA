// Classe base que define os atributos e métodos principais de quem usa a Força
public class Forca {
    // Atributos de qualquer personagem que utiliza a força
    protected int forca;
    protected int vida;
    protected String genero;
    protected String nome;

    // Construtor que inicia os atributos do personagem
    public Forca(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Forca oponente) {
        System.out.println(this.nome + " atacou " + oponente.nome + " com força de " + this.forca);
        oponente.vida -= this.forca; // Diminui a vida do oponente
        System.out.println(oponente.nome + " agora tem " + oponente.vida + " de vida.");
    }
    public void voadora(Forca oponente) {
        int dano = this.forca + 50;  // Aumenta a força do ataque em 50 para a voadora
        oponente.vida -= dano;
        System.out.println(this.nome + " deu uma voadora em " + oponente.nome + " com força de " + dano);
        System.out.println(oponente.nome + " agora tem " + oponente.vida + " de vida.");
    }
}


