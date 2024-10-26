// Classe MestreSith (herança de Sith e implementação de Raios)
public class MestreSith extends Sith implements Raios {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        this.forca = 120;
    }
    @Override
    public void usarRaio() {
        System.out.println(this.nome + " usou raios!");
    }

    @Override
    public int forcaExtra() {
        return 30;
    }
}