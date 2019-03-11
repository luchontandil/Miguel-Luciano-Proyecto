package videoclub;

public class Persona {
	private String nombre;
	private String dni;
	private Fecha fNacimiento;
	private String email;
	private Pelicula pelicula;
	private String direccion;
	
	
	public Persona(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.fNacimiento = fNacimiento;
		this.email = email;
		this.pelicula = pelicula;
		this.direccion = direccion;
	}
	
	public int getEdad() {
		return this.fNacimiento.calcDif(this.fNacimiento);
	}
	
	public boolean alquilar(Pelicula pelicula) {
		boolean success;
		if((this.pelicula == null) && (this.getEdad() >= pelicula.getEdadMin())) {
			this.pelicula = pelicula;
			success = true;
		}
		else {
			success = false;
		}
		return success;
	}
	
	public boolean devolver() {
		boolean success;
		if(this.pelicula != null) {
			this.pelicula.setDisponible(true);
			this.pelicula = null;
			success = true;
		}
		else {
			success = false;
		}
		return success;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", direccion=" + direccion + ", edad="+this.getEdad()+"]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Fecha getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(Fecha fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
