package videoclub;

// TODO: Auto-generated Javadoc
/**
 * The Class Socio.
 */
public class Socio extends Persona{
	
	/** The n socio. */
	private int nSocio;

	/**
	 * Instantiates a new socio.
	 *
	 * @param nombre the nombre
	 * @param dni the dni
	 * @param fNacimiento the f nacimiento
	 * @param email the email
	 * @param pelicula the pelicula
	 * @param direccion the direccion
	 * @param nSocio the n socio
	 */
	public Socio(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion,int nSocio) {
		super(nombre, dni, fNacimiento, email, pelicula, direccion);
		this.nSocio = nSocio;
	}

	/**
	 * Gets the n socio.
	 *
	 * @return the n socio
	 */
	public int getnSocio() {
		return nSocio;
	}

	/**
	 * Sets the n socio.
	 *
	 * @param nSocio the new n socio
	 */
	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}
	

}
