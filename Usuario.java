class Usuario{
	private String nombreUsuario;
	private int id;
	private Cuenta cuenta;
	private Carrito carrito;
	public Usuario(){}
	public Usuario(String nombreUsuario,Carrito carrito,Cuenta cuenta){
		this.nombreUsuario=nombreUsuario;
		this.cuenta=cuenta;
		this.carrito=carrito;
	}
	public void setNombreUsuario(String nombreUsuario){
		this.nombreUsuario=nombreUsuario;
	}
	public String getNombreUsuario(){
		return this.nombreUsuario;
	}
	public void setCarrito(Carrito carrito){
		this.carrito=carrito;
	}
	public Carrito getCarrito(){
		return this.carrito;
	}
	public void setCuenta(Cuenta cuenta){
		this.cuenta=cuenta;
	} 
	public Cuenta getCuenta(){
		return this.cuenta;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
}