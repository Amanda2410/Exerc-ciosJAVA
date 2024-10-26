// Classe MestreJedi (herança de Jedi e implementação de Raios)
public class MestreJedi extends Jedi implements Raios {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        this.forca = 100;
    }

    @Override
    public void usarRaio() {
        System.out.println(this.nome + " usou raios!");
    }
    @Override
    public int forcaExtra() {
        return 20;
    }
}