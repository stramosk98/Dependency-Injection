package D_injection;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Conexao.Conexao;
import Model.Produto;

public class MySQLProduto implements IProduto {
	
	final String NOMEDATABELA = "produto";
	  
	public void salvarDados(Produto produto) {
		try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nomeProduto, quantidade) VALUES (?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
//            ps.setInt(2, produto.getQuantidade());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
