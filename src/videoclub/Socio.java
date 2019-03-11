package videoclub;

public class Socio extends Persona{
	private int nSocio;

	public Socio(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion,int nSocio) {
		super(nombre, dni, fNacimiento, email, pelicula, direccion);
		this.nSocio = nSocio;
	}

	public int getnSocio() {
		return nSocio;
	}

	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}
	

}
