import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria o jogador e o vilão(computador)
        Heroi jogador = new Heroi("Jogador", 100, 20);
        Vilao Rob = new Vilao("Rob", 100, 15);

        System.out.println("Início do jogo!");

        // Loop do jogo enquanto ambos estiverem vivos:)
        while (jogador.getVida() > 0 && Rob.getVida() > 0) {
            System.out.println("\nEscolha a ação: (1) Atacar (2) Curar");
            int escolha = scanner.nextInt();

            // Ação do jogadorx
            if (escolha == 1) {
                jogador.atacar(Rob);
            } else if (escolha == 2) {
                jogador.curar();
            } else {
                System.out.println("Opção inválida!");
                continue;
            }
            // Ação do computador, se ainda estiver vivo
            if (Rob.getVida() > 0) {
                Rob.atacar(jogador);
            }
            // Mostra o estado de ambos.
            System.out.println("Jogador: " + jogador.getVida() + " de vida.");
            System.out.println("Rob: " + Rob.getVida() + " de vida.");
        }
        // Resultado do jogo.
        if (jogador.getVida() > 0) {
            System.out.println("Parabéns! Você venceu.");
        } else {
            System.out.println("Você perdeu. Rob venceu.");
        }
        scanner.close();
    }
}
