import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maicon", 345698, "Rua Horácio", 987654321);
        Caixa cx = new Caixa("Vini", 234562, "Rua Biguaçu", 876543210);
        Cliente cli = new Cliente("Will", 345673, "Rua Valorant", 765432109);

        Date agora = new Date();
        Conta conta = new Conta(1, agora,agora);
        Mesa mesa = new Mesa(agora);

        f1.controlaOcupacaoDeMesa();
        cx.abrirConta();
        // Exibindo valores iniciais usando getters
        System.out.println("Nome do Cliente: " + cli.getNome());
        System.out.println("Identidade do Cliente: " + cli.getIdentidade());
        System.out.println("Endereço do Cliente: " + cli.getEndereco());
        System.out.println("Telefone do Cliente: " + cli.getTelefone());
        System.out.println("Abertura: " + conta.getdataAbertura());
        mesa.gerarRelatorioDeOcupacao();
        cli.selecionarCardapio();
        cli.solicitarFechamentoConta();
        f1.encaminhamentoSolicitacaoDeFechamentoConta();
        System.out.println("Data de fechamento: " + conta.getdataFechamento());
        conta.exibirValorTotal();
        conta.setGarcom(5);
        System.out.println("Garçom recebeu uma gorjeta no valor de: " + conta.getGarcom());
        System.out.println("Funcionário demitido! : " + f1.getNome());
        // Modificando valores usando setters
        f1.setNome("Tutu");
        f1.setEndereco("Rua Verde");
        f1.setIdentidade(123336);
        f1.setTelefone(123456789);
        System.out.println("Novo funcionário contratado: " + f1.getNome());
        // Exibindo valores modificados usando getters
        System.out.println("Nome do Funcionário: " + f1.getNome());
        System.out.println("Endereço do Funcionário: " + f1.getEndereco());
        System.out.println("Telefone do Funcionário: " + f1.getTelefone());
        f1.controlaOcupacaoDeMesa();
        cx.abrirConta();
        cli.solicitarCancelamentoConta();
        f1.encaminhaSolicitacaoDeCancelamentoConta();
        conta.avisarCancelamento();
    }
}

// A classe Date do pacote java.util para representar datas e horários
// A classe Date permite registrar e manipular datas (dia, mês, ano, hora, minuto, segundo).
// Ela é útil para registrar, por exemplo, a data de abertura e fechamento de contas.