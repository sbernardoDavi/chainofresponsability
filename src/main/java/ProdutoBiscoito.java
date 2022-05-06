public class ProdutoBiscoito implements  TipoProduto{
    private  static ProdutoBiscoito produtoBiscoito = new ProdutoBiscoito();

    private ProdutoBiscoito(){};

    public static ProdutoBiscoito getProdutoBiscoito(){
        return produtoBiscoito;
    }
}
