package Model;

public class Marca {
	
	private int idMarca;
	private String nomeMarca;
	
	public Marca(int idMarca, String nomeMarca) {
		super();
		this.idMarca = idMarca;
		this.nomeMarca = nomeMarca;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca [idMarca=");
		builder.append(idMarca);
		builder.append(", nomeMarca=");
		builder.append(nomeMarca);
		builder.append("]");
		return builder.toString();
	}
	
}