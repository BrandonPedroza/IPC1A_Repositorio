
public class tareaEspecial {
	
	
	
	public class problema1{
/* El programa permite que la emprese lleve la
 * cuenta del sueldo de sus conductor.
 * Se les paga segun las horas trabajadas
 * y los tipos de transportes que realizaron.
*/
		
		
public class Cliente {
	public int edad;
	public void pagar() {
	
	}
}

public class Colectivo {
	public int numeroPersonas;
}

public class Conductor {
	public String dpi;
	public int sueldoFijo;
	public void Conducir() {
	
	}
}

public class Mercancia {
	public int peso;
}


public class Persona extends Cliente { 
	public char nombre;
}

public class Sueldo {
	public int horas;
	public char transporte;
	public void escojerTrasporte() {
	
	}
	
	public void EscojerHoras() {
	
	}
}
	

public class Transporte {
	public String tipo;
	public void pedirPersonas() {
	
	}
}


}
	
	
	
	public class problema2{
		/*El programa permite organizar los recursos
		 * de un zoologico tomando en cuenta sus especies,
		 * empleados e itinerarios.
		 */	

public class Empleado {
	public String nombre;
	public String direccion;
	public int telefono;
	public String fecha;
}


public class Cuidadores extends Empleado {
	public String fechaCargo;
	public void Cuidar() {
	
	}
}

public class Especies {
	public String nombreEspañol;
	public void vivir() {
	
	}
}



public class Guias extends Empleado {
	public String itinerario;
	public String hora;
	public void guiar() {
	
	}
}


public class Habitad {
	public String nombre;
	public String clima;
	public String continente;
}


public class Itinerario {
	public int codigo;
	public int duracion;
	public int longitud;
	public int visitantes;
	public int nuEspecies;
}


public class Zona {
	public String nombre;
	public double extension;
}


	}
	
	public class problema3{
		/*El programa permite reservar y alquilar
		 * automoviles.
		 */	

		

public class Automovil {
	public double precio;
	public double galones;
	public boolean estado;
	public String matricula;
}

public class Reserva {
	public String fechaInicio;
	public String fechaFinal;
	public String agencia;
}


public class Cliente {
	public long dpi;
	public String nombre;
	public String direccion;
	public int telefono;
	public void reservar() {
	
	}
}
	
	}
	
	
	public class problema4{
		/*El programa permite llevar el control de los
		 * empleados de una empresa y su planilla y permite 
		 * realizar contratos y despido de personal.
		 */	

public class Empleado {
	public long dpi;
	public String nombre;
	public String direccion;
	public int telefono;
	public String fecha;
	public double sueldoMensual;
}

public class Encargado extends Empleado {
	public void Mandar() {
	
	}
}

public class Limpiador extends Empleado {
}

public class Comercial extends Empleado {
}
public class Administrativo extends Empleado {
}

	}
	
	
	public class problema5{
		/*El programa permite llevar el control de los
		 * objetos de un museo. Verificar la informacion de 
		 * una pintura o escultura y ver si esta en exposicion.
		 */	
		
		public class Artista {
			public String nombe;
			public String fecha;
			public void crear() {
			
			}
		}


public class Escultura extends Objeto {
	public String material;
	public double altura;
	public double peso;
	public String estilo;
}



public class Exposicion {
	public String fechaInicio;
	public String fechaFin;
}


public class Objeto {
	public String id;
	public String titulo;
	public String tipo;
	public boolean pertenencia;
}


public class Pintura extends Objeto {
	public String tipo;
	public String soporte;
	public String estilo;
}

	}
	
	public class problema6{
		/*El programa permite llevar el control de los
		 * trabajos realizados en el taller y calcular el
		 * costo de trabajos segun el tipo de trabajo 
		 * y  la cantidad de material utilizado en 
		 * cada trabajo.
		 */	
		


public class Reparacion {
	public int material;
	public double precio;
}

public class ChapaPintura extends Reparacion {
	public int coste;
}
public class Material {
	public Object cantidad;
}
public class Revision extends Reparacion {
	public int coste;
}

public class Trabajo {
	public int id;
	public double hora;
	public void hacer() {
	
	}
	
	public void cobrar() {
	
	}
}
	}
	
	public class problema7{
		/*El programa permite llevar el control de los
		 * viajes y reservas que un cliente hace para 
		 * hospedarse en un establecimiento a su gusto y
		 * calcular el costo del viaje.
		 */	
		

public class Aeropuerto {
	public String id;
	public String nombre;
}

public class Establecimiento {
	public double precio;
	public String tipo;
}

public class Albergue extends Establecimiento {
	public boolean carnet;
}
public class Apartamento extends Establecimiento {
}

public class Cliente {
	public String nombre;
	public String direccion;
	public int telefono;
	public long dpi;
	public String cuidad;
}

public class Hotel extends Establecimiento {
}

public class Reserva {
	public String cuidad;
	public String fechaLlegada;
	public String fechaSalida;
}

public class Viaje {
}

public class Vuelo {
	public String id;
	public String horaSalida;
	public String horaLlegada;
	public double precio;
}

	}
}
