class Carrito{
	private Libro libro;
	private int totalLibros;
	private int cantidadPorLibro;
	private double pesoTotal;
	public Carrito(){}
	public Carrito(Libro libro,int totalLibros,int cantidadPorLibro){
		this.libro=libro;
		this.totalLibros=totalLibros;
		this.cantidadPorLibro=cantidadPorLibro;
	}
	public int getTotalLibros(){
		return this.totalLibros;
	}
	public void setTotalLibros(int totalLibros){
		this.totalLibros=totalLibros;
	}
	public int getCantidadPorLibro(){
		return this.cantidadPorLibro;
	}
	public void setCantidadPorLibro(int cantidadPorLibro){
		this.cantidadPorLibro=cantidadPorLibro;
	}
	public Libro getLibro(){
		return this.libro;
	}
	public void setLibro(Libro libro){
		this.libro=libro;
	}
	public double getPesoTotal(){
		return this.pesoTotal
	}
	public void setPesoTotal(double pesoTotal){
		this.pesoTotal=pesoTotal;
	}
}