public class Pessoa {
    public void sacar(Cartao cartao, float valor ) throws Exception {
        BancoVinteQuatroHoras.getInstancia().sacar(valor,cartao);
    }
    public float obterSaldo(Cartao cartao) throws Exception{
        return BancoVinteQuatroHoras.getInstancia().obterSaldo(cartao);
    }
}
