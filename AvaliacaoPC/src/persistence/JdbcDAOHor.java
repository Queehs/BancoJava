package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Horista;


public class JdbcDAOHor {
private Connection conn;
	
	public JdbcDAOHor(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Horista e) throws SQLException {
		String sql = "insert into horista values ('"+e.getPrecohora()+"', '"+e.getHorastrabalhadas()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
                prepareStatement.close();
	}
}
