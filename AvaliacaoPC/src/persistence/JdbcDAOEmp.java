package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Empregado;

public class JdbcDAOEmp {
private Connection conn;
	
	public JdbcDAOEmp(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Empregado e) throws SQLException {
		String sql = "insert into empregado values ('"+e.getNome()+"', '"+e.getSobrenome()+"','"+e.getCPF()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
                prepareStatement.close();
	}
}
