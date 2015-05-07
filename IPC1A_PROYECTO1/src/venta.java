
public class venta {
	int producto;
	String fecha;
	int cantidad;
	int empleado;
	int cliente;
	
		
	public venta(int producto, String fecha, int cantidad, int empleado,
			int cliente) {
		super();
		this.producto = producto;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.empleado = empleado;
		this.cliente = cliente;
	}
	
	
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}


}
