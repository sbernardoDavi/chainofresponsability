public class ProdutoRoupa implements TipoProduto{
    private  static ProdutoRoupa produtoRoupa = new ProdutoRoupa();

    private ProdutoRoupa(){};

    public static ProdutoRoupa getProdutoRoupa(){
        return produtoRoupa;
    }
}
