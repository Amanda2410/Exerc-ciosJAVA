//Defini a classe Calculadora, que conterá os atributos e métodos necessários
public class Calculadora {

    // Dois números inteiros para realizar as operações
    private int num1;
    private int num2;
    // Construtor da classe, que inicializa os atributos com valores fornecidos
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // Métodos get e set para acessar e modificar os valores de num1 e num2
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int some() {
        return num1 + num2;
    }
    // Retorna a subtração de num1 e num2
    public int subtraia() {
        return num1 - num2;
    }
    // Retorna a divisão de num1 e num2, inclui verificação de divisão por zero
    public int divida() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0; // Retorna 0 se houver tentativa de divisão por zero.
        }
    }
    // Retorna a multiplicação de num1 e num2
    public int multiplique() {
        return num1 * num2;
    }
}
