package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Assalariado;


public class JdbcDAOAss {
private Connection conn;
	
	public JdbcDAOAss(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Assalariado c) throws SQLException {
		String sql = "insert into assalariado values ('"+c.getSalario()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	public void listar() {
		String sql = "select * from assalariado";
        System.out.println(sql);
	}
}
