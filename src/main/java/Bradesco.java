public class Bradesco extends Banco{
    private static Bradesco instance = new Bradesco();

    private Bradesco() {};

    public static Bradesco getInstance() {
        return instance;
    }

    @Override
    public void sacar(float valor, int conta) throws Exception {
        ContaBancaria contaBancaria = obterConta(conta);
        if (contaBancaria.getSaldo() < (valor + 2.5f)) {
            throw new Exception("Valor de saque superior ao saldo");
        }
        contaBancaria.setSaldo(contaBancaria.getSaldo() - (valor + 2.5f));
    }


    @Override
    public float obterSaldo(int conta) throws Exception {
        return obterConta(conta).getSaldo();
    }

}
