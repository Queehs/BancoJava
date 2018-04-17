package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Comissionado;

public class JdbcDAOCom {
private Connection conn;
	
	public JdbcDAOCom(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Comissionado e) throws SQLException {
		String sql = "insert into comissionado values ('"+e.getTotalvenda()+"', '"+e.getTaxacomissao()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
                prepareStatement.close();
	}
}
