import java.sql.*;
class Libro{
	String titulo;
	String autor;
	double precio;
	double peso;
	int cantDisponilbe;
	Connection conect = (new BaseDatos()).conection();
	public Libro(){}
	public Libro(String titulo,String autor,double precio,double peso,int cantDisponible){
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
		this.peso=peso;
		this.cantDisponible;
	}
	public int getCantDisponible(){
		PreparedStatement pstmt=null;
			try{
				
			}catch(SQLException e){
				
			}
		
	}
	
}