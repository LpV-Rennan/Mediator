public class BancoVinteQuatroHoras{
    private static  BancoVinteQuatroHoras instancia = new BancoVinteQuatroHoras();
    public static BancoVinteQuatroHoras getInstancia() {
        return instancia;
    }
    private BancoVinteQuatroHoras(){}

    public void sacar(float valor, Cartao cartao) throws Exception {
            cartao.getBanco().sacar(valor,cartao.getConta());
    }
    public Float obterSaldo(Cartao cartao) throws Exception {
        return cartao.getBanco().obterSaldo(cartao.getConta());
    }
}
