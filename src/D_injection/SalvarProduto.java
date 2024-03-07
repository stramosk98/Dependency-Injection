package D_injection;

import Model.Marca;
import Model.Produto;

public class SalvarProduto {
	
	private IProduto i_prod;
	
	public SalvarProduto(IProduto i_prod) {
		this.i_prod = i_prod;
	}
	
	public void salvar(Produto produto) {
		i_prod.salvarDados(produto);
	}
	
}