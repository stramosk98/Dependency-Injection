package Enum;

public enum Caminho {

	JSONPATH("C:\\Users\\anton\\OneDrive\\�rea de Trabalho\\exemplo.json"),
	XMLPATH("C:\\Users\\anton\\OneDrive\\�rea de Trabalho\\exemplo.xml");
	
	private String descricao;
	
	Caminho(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}