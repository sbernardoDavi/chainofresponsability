public class VendedorChapeu extends Funcionario{

    public VendedorChapeu(Funcionario vendedor){
        listaProdutos.add(ProdutoChapeu.getProdutoChapeu());
        setFuncionarioSuperior(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor chapéu.";
    }
}
