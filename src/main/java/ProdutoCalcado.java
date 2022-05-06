public class ProdutoCalcado implements TipoProduto{
    private  static ProdutoCalcado produtoCalcado = new ProdutoCalcado();

    private ProdutoCalcado(){};

    public static ProdutoCalcado getProdutoCalcado(){
        return produtoCalcado;
    }
}
