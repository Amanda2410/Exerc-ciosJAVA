import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;

        System.out.println("Bem-vindo! Digite um operador (+, -, /, *) e dois números. Para sair, digite '.'.");

        // Loop principal que continua até o usuário digitar ".".
        while (true) {
            // Lê o operador
            System.out.print("Digite o operador (+, -, /, *): ");
            operador = scanner.next();

            // Verifica se o usuário deseja encerrar o programa
            if (operador.equals(".")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            // Lê os dois números inteiros
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            // Cria uma nova instância da calculadora com os números fornecidos
            Calculadora calculadora = new Calculadora(num1, num2);

            // Verifica o operador e chama o metodo correspondente da classe Calculadora
            int resultado;
            switch (operador) {
                case "+":
                    resultado = calculadora.some();
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case "-":
                    resultado = calculadora.subtraia();
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case "/":
                    resultado = calculadora.divida();
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                case "*":
                    resultado = calculadora.multiplique();
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido. Tente novamente.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}