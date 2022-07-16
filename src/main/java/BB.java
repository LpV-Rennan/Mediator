import java.util.ArrayList;

public class BB extends Banco {

    private static BB instance = new BB();

    private BB() {};

    public static BB getInstance() {
        return instance;
    }

    @Override
    public void sacar(float valor, int conta) throws Exception {
        ContaBancaria contaBancaria = obterConta(conta);
        if (contaBancaria.getSaldo() < valor) {
            throw new Exception("Valor de saque superior ao saldo");
        }
        contaBancaria.setSaldo(contaBancaria.getSaldo() - valor);
    }


    @Override
    public float obterSaldo(int conta) throws Exception {
        return obterConta(conta).getSaldo();
    }


}
