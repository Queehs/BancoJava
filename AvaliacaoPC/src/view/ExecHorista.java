package view;

import java.sql.Connection;

import model.Horista;
import persistence.Conexao;
import persistence.JdbcDAOHor;


public class ExecHorista {
	public static void main(String args[]) {
		Horista hor = new Horista();
		try {
			
			hor.setPrecohora("70");
			hor.setHorastrabalhadas("30");
			
			Connection connection = Conexao.getConnection();
			JdbcDAOHor jdbcass = new JdbcDAOHor(connection);
			
			JdbcDAOHor.salvar(hor);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
