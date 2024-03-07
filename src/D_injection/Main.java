package D_injection;

import Model.Produto;

public class Main {

	public static void main(String[] args) {
		
		SalvarProduto salvarProduto = new SalvarProduto(new JSONProduto());
		Produto produto = new Produto(2, "mouse", 3, 9.50);
		
		salvarProduto.salvar(produto);
	}

}