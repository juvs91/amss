class Cuenta{
	private String password;
	private String nombre;
	public Cuenta(){}
	public Cuenta(String password,String nombre){
		this.password=password;
		this.nombre=nombre;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
}