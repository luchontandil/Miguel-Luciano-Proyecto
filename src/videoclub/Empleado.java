package videoclub;

public class Empleado extends Persona{
	private double descuento;

	public Empleado(String nombre, String dni, Fecha fNacimiento, String email, Pelicula pelicula, String direccion, double descuento) {
		super(nombre, dni, fNacimiento, email, pelicula, direccion);
		this.descuento = descuento;
	}
	
	
	
}
