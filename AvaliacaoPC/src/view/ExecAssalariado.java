package view;

import java.sql.Connection;

import model.Assalariado;
import persistence.Conexao;
import persistence.JdbcDAOAss;


public class ExecAssalariado {
	public static void main(String args[]) {
		Assalariado ass = new Assalariado();
		try {
			
			ass.setSalario("800");
			
			Connection connection = Conexao.getConnection();
			JdbcDAOAss jdbcass = new JdbcDAOAss(connection);
			
			JdbcDAOAss.salvar(ass);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
