import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {
    Cartao bradesco, bb;
    ContaBancaria contaBradesco, contaBB;
    ArrayList<ContaBancaria> contasBradesco, contasBB;
    Pessoa pessoa;
    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();

        bb = new Cartao(BB.getInstance(), 1);
        contaBB = new ContaBancaria(100f, 1);
        contasBB = new ArrayList<ContaBancaria>();
        contasBB.add(contaBB);
        BB.getInstance().setContas(contasBB);

        bradesco = new Cartao(Bradesco.getInstance(),12);
        contaBradesco = new ContaBancaria(500f, 12);
        contasBradesco = new ArrayList<ContaBancaria>();
        contasBradesco.add(contaBradesco);
        Bradesco.getInstance().setContas(contasBradesco);

    }

    @Test
    void deveRetornarSaldoBB() {
        try {
            assertEquals(100f , pessoa.obterSaldo(bb));
        } catch (Exception e) {
        }
    }
    @Test
    void deveRetornarSaldoBradesco() {
        try {
            assertEquals(500f , pessoa.obterSaldo(bradesco));
        } catch (Exception e) {
        }
    }

    @Test
    void deveSacarBB() {
        try {
            pessoa.sacar(bb,2f);
            assertEquals(98f , pessoa.obterSaldo(bb));
        } catch (Exception e) {
        }
    }

    @Test
    void deveSacarBradesco() {
        try {
            pessoa.sacar(bradesco,340f);
            assertEquals(157.5f , pessoa.obterSaldo(bradesco));
        } catch (Exception e) {
        }
    }


}