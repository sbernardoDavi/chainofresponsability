import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    VendedorCalcado vendedorCalcado;
    VendedorRoupa vendedorRoupa;

    VendedorChapeu vendedorChapeu;

    @BeforeEach
    void setUp(){
        vendedorCalcado = new VendedorCalcado(vendedorCalcado);
        vendedorRoupa = new VendedorRoupa(vendedorRoupa);
        vendedorChapeu = new VendedorChapeu(vendedorChapeu);

    }

    @Test
    public void deveRetornarFuncionarioVenderCalcado(){
        assertEquals("Vendedor calçado.", vendedorCalcado.venderProduto(new Produto(ProdutoCalcado.getProdutoCalcado())));
    }

    @Test
    public void deveRetornarFuncionarioVenderRoupa(){
        assertEquals("Vendedor roupa.", vendedorRoupa.venderProduto((new Produto(ProdutoRoupa.getProdutoRoupa()))));
    }

    @Test
    public void deveRetornarFuncionarioVenderChapeu(){
        assertEquals("Vendedor chapéu.", vendedorChapeu.venderProduto(new Produto(ProdutoChapeu.getProdutoChapeu())));
    }

    @Test
    public void deveRetornarVendaInvalidaBiscoito(){
        assertEquals("venda inválida.", vendedorChapeu.venderProduto(new Produto(ProdutoBiscoito.getProdutoBiscoito())));
    }


}