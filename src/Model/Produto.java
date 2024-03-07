package Model;

public class Produto {
	
	private int idProduto;
	private String nomeProduto;
	private int idMarca;
	private double preco;
	
	
	public Produto(int idProduto, String nomeProduto, int idMarca, double preco) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.idMarca = idMarca;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [idProduto=");
		builder.append(idProduto);
		builder.append(", nomeProduto=");
		builder.append(nomeProduto);
		builder.append(", idMarca=");
		builder.append(idMarca);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
}