
public class cliente {
	int codigo;
	String nombre;
	String apellido;
	long nit;
	
	
	
	public cliente(int codigo, String nombre, String apellido, long nit) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nit = nit;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getNit() {
		return nit;
	}
	public void setNit(long nit) {
		this.nit = nit;
	}


}
