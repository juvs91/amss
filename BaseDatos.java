import java.io.*;
import java.sql.*;

class BaseDatos{
	private static String url="jdbc:mysql://localhost:8889/chat";
	private static String usuario="root";
	private static String clave="root";
	
	
	public Connection conection(){
		Connection conect = null;
		try{
			conect=DriverManager.getConnection(url,usuario,clave);
		}catch(SQLException e){
			System.out.println("ERROR: "+e.getMessage());
		}
		return conect;
	}
}
