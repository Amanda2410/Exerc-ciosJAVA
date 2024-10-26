// Herda de Personagem, implementa o ataque do herói
class Heroi extends Personagem {
    public Heroi(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }
    // Implementação do ataque do herói, reduzindo vida do oponente
    @Override
    public void atacar(Personagem p) {
        System.out.println(getNome() + " ataca " + p.getNome() + " com " + getForca() + " de força!");
        p.setVida(p.getVida() - getForca());
    }
}
