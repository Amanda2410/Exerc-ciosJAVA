//Classe Jedi
public class Jedi extends Forca {
    public Jedi(String nome, int vida) {
        super(nome, vida, 0); // Define a força como 0 no início
        this.genero = "Jedi";
    }
}