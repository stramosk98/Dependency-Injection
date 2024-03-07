package Model;

import java.util.Date;

public class Venda {
	
	private int idVenda;
	private Date dataVenda;
	private Date dataVencimento;
	
	public Venda(int idVenda, Date dataVenda, Date dataVencimento) {
		super();
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.dataVencimento = dataVencimento;
	}
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Venda [idVenda=");
		builder.append(idVenda);
		builder.append(", dataVenda=");
		builder.append(dataVenda);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
}