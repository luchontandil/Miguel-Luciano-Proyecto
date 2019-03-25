package videoclub;

// TODO: Auto-generated Javadoc
/**
 * The Class Empleado.
 */
public class Empleado extends Persona{
	
	/** The descuento. */
	private double descuento;

	/**
	 * Instantiates a new empleado.
	 *
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param fNacimiento the f nacimiento
	 * @param email the email
	 * @param pelicula the pelicula
	 * @param direccion the direccion
	 * @param descuento the descuento
	 */
	public Empleado(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion, double descuento) {
		super(nombre, dni, fNacimiento, email, pelicula, direccion);
		this.descuento = descuento;
	}
	
	/**
	 * Gets the descuento.
	 *
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}
	
	/**
	 * Sets the descuento.
	 *
	 * @param descuento the new descuento
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

}
