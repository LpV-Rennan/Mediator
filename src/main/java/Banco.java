import java.util.ArrayList;

public abstract class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    protected ArrayList<ContaBancaria> getContas() {
        return contas;
    }
    protected ContaBancaria obterConta(int conta) throws Exception {
        for(ContaBancaria contaBancaria : contas ){
            if (contaBancaria.getConta() == conta){
                return  contaBancaria;
            }
        }
        throw new Exception("Conta não encontrada");
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }
    abstract void sacar(float valor, int conta) throws Exception;
    abstract float obterSaldo(int conta)throws Exception;
}
