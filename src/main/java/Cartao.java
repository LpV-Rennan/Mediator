public class Cartao {
    private Banco banco;
    private int conta;

    public Cartao(Banco banco, int conta) {
        this.banco = banco;
        this.conta = conta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
