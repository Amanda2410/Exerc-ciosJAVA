import java.util.Random;
class Vilao extends Personagem {
    public Vilao(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }
    @Override
    public void atacar(Personagem p) {
        Random rand = new Random();
        int dano = rand.nextInt(getForca()) + 1; // Um ataque aleatório baseado na força do vilão
        System.out.println(getNome() + " ataca " + p.getNome() + " causando " + dano + " de dano!");
        p.setVida(p.getVida() - dano);
    }
}
//Notas:
//Random é uma classe do Java, localizada no pacote java.util, que permite gerar números aleatórios.
//É muito usada em jogos e simulações para criar situações imprevisíveis, como ataques com danos variados.
//Aqui o Random foi utilizado para gerar números aleatórios nos métodos de ataque do vilão e na cura dos personagens.
//Isso torna a ação menos previsível, pois o valor de dano ou de cura varia a cada execução.