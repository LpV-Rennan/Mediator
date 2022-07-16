public class ContaBancaria {
    private float saldo;
    private int numero;

    public ContaBancaria(float saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public int getConta() {
        return numero;
    }
}
