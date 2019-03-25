/*
 * 
 */
package videoclub;

/**
 * The Class Persona.
 */
public class Persona {
	
	/** The nombre. */
	private String nombre;
	
	/** The dni. */
	private String dni;
	
	/** The nacimiento. */
	private Fecha fNacimiento;
	
	/** The email. */
	private String email;
	
	/** The pelicula. */
	private Pelicula pelicula;
	
	/** The direccion. */
	private String direccion;
	
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param fNacimiento the f nacimiento
	 * @param email the email
	 * @param pelicula the pelicula
	 * @param direccion the direccion
	 */
	public Persona(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.fNacimiento = fNacimiento;
		this.email = email;
		this.pelicula = pelicula;
		this.direccion = direccion;
	}
	
	
	/**
	 * Puede alquilar.
	 *
	 * @param pelicula de tipo Pelicula
	 * @return true, if successful
	 */
	public boolean puedeAlquilar(Pelicula pelicula) {
	boolean success;
	if(this.fNacimiento.calcDif(this.fNacimiento) >= pelicula.getEdadMin()) {
		success = true;
	}
	else {
		success = false;
	}
	return success;
}
	
//	public int getEdad() {
//		return this.fNacimiento.calcDif(this.fNacimiento);
//	}
	
//	public boolean alquilar(Pelicula pelicula) {
//		boolean success;
//		if((this.pelicula == null) && (this.getEdad() >= pelicula.getEdadMin())) {
//			this.pelicula = pelicula;
//			success = true;
//		}
//		else {
//			success = false;
//		}
//		return success;
//	}
	
//	public boolean devolver() {
//		boolean success;
//		if(this.pelicula != null) {
//			this.pelicula.setDisponible(true);
//			this.pelicula = null;
//			success = true;
//		}
//		else {
//			success = false;
//		}
//		return success;
//	}

public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", direccion=" + direccion + ", edad="+this.fNacimiento.calcDif(this.fNacimiento)+"]";
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Gets the f nacimiento.
	 *
	 * @return the f nacimiento
	 */
	public Fecha getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * Sets the f nacimiento.
	 *
	 * @param fNacimiento the new f nacimiento
	 */
	public void setfNacimiento(Fecha fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the pelicula.
	 *
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * Sets the pelicula.
	 *
	 * @param pelicula the new pelicula
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
