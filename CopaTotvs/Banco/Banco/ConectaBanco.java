package Banco;
import java.sql.*;

import javax.swing.JOptionPane;


public class ConectaBanco {
	
	private Connection conecta=null;
	private String host = "bhd0005357";
	private String database = "COPATOTVS";
	private String driveConexao = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String usuario = "rm";
	private String senha = "rm";
	private String url = "jdbc:sqlserver://" + host + ";DatabaseName=" + database;
	
	public Connection getConecta() {
		return conecta;
	}
	
	/**
	 * @author Fellipe/Tiago
	 * @return <i>true</i> - Para conex�o que se abrir corretamente
	 * <br>
	 * <i>false</i> - Para abertura de conex�o que falhar. 
	 */
	public boolean abreConexao()
	{
		try {
			
			Class.forName(driveConexao);
			//System.out.println("Driver existente");
			this.conecta = DriverManager.getConnection(this.url, this.usuario, this.senha);
			//System.out.println("conecta OK");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
				
	}
	
	/**
	 * @author Fellipe/Tiago
	 * @return <i>true</i> - Para conex�o que se fecha corretamente
	 * <br>
	 * <i>false</i> - Para fechamento de conex�o que falhar. 
	 */
	public boolean fechaConexao ()
	
	{
		try {
			this.conecta.close();
			System.out.println("Conex�o fechada");
			return true;
		} catch (Exception e) {
			//e.printStackTrace();
			return false;
		}		
	}




}
