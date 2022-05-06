public class VendedorCalcado extends Funcionario{
    public VendedorCalcado(Funcionario vendedor){
        listaProdutos.add(ProdutoCalcado.getProdutoCalcado());
        setFuncionarioSuperior(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor calçado.";
    }
}
