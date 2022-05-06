public class VendedorRoupa extends Funcionario{
    public VendedorRoupa(Funcionario vendedor){
        listaProdutos.add(ProdutoRoupa.getProdutoRoupa());
        setFuncionarioSuperior(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor roupa.";
    }


}
