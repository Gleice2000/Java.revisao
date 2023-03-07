package ContasPagas;

public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }
    public void visualizarConta() {
        System.out.println("\nIdentificador: " + idConta);
        System.out.println("Produto comprado: " + pro.getDescricaoProduto());
        System.out.println("Nome do cliente: " + cli.getNomeCliente());
        System.out.println("CPF: " + cli.getCpf());
        System.out.println("Valor do produto: " + pro.getValorProduto());
        System.out.println("Data do vencimento: " + dataVencimento);
        System.out.println("Data do pagamento: " + dataPagamento);
    }
}