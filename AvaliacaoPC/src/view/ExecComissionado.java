package view;

import java.sql.Connection;

import model.Comissionado;
import persistence.Conexao;
import persistence.JdbcDAOCom;

public class ExecComissionado {
	public static void main(String args[]) {
		Comissionado com = new Comissionado();
		try {
			
			com.setTotalvenda("500");
			com.setTaxacomissao("200");
			
			Connection connection = Conexao.getConnection();
			JdbcDAOCom jdbcass = new JdbcDAOCom(connection);
			
			JdbcDAOCom.salvar(com);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
