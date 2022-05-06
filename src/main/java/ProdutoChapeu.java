public class ProdutoChapeu implements  TipoProduto{
    private  static ProdutoChapeu produtoChapeu = new ProdutoChapeu();

    private ProdutoChapeu(){};

    public static ProdutoChapeu getProdutoChapeu(){
        return produtoChapeu;
    }

}

