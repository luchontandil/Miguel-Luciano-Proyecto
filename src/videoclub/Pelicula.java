
package videoclub;

/**
 *
 * @author MIGUEL
 */
/**
 * The Class Empleado.
 */
public class Pelicula {
    /** 
     * String de numeros para identificar una pelicula.
     * The id. 
     */
    private String id;
    /** 
     * Numero entero que permite saber la edad minima recomendada para poder ver la pelicula
     * The edadMin. 
     */
    private int edadMin;
    /** 
     * Nombre del director de la pelicula
     * The director. 
     */
    private String director;
    /** 
     * Precio de alquiler de la pelicula
     * The precio. 
     */
    private double precio;
    /** 
     * Titulo de la pelicula
     * The titulo. 
     */
    private String titulo;
    /** 
     * Verdaderoo o false para saber si esta disponible una pelicula
     * The disponible. 
     */
    private boolean disponible;

////////////////////// GET Y SET \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    /**
    * Gets the  id.
    *
    * @return the id
    */
    public String getId() {
        return id;
    }
    /**
    * Sets the id.
    *
    * @param id the new ID
    */
    public void setId(String id) {
        this.id = id;
    }
    /**
    * Gets the EdadMin.
    *
    * @return the EdadMin
    */
    public int getEdadMin() {
        return edadMin;
    }
    /**
    * Sets the EdadMin.
    *
    * @param EdadMin the new EdadMin
    */
    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
    /**
    * Gets the Director.
    *
    * @return the Director
    */
    public String getDirector() {
        return director;
    }
    /**
    * Sets the Director.
    *
    * @param Director the new Director
    */
    public void setDirector(String director) {
        this.director = director;
    }
    /**
    * Gets the Precio.
    *
    * @return the Precio
    */
    public double getPrecio() {
        return precio;
    }
    /**
    * Sets the Precio.
    *
    * @param Precio the new Precio
    */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
    * Gets the Titulo.
    *
    * @return the Titulo
    */
    public String getTitulo() {
        return titulo;
    }
    /**
    * Sets the Titulo.
    *
    * @param Titulo the new Titulo
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
    * Gets the Disponible.
    *
    * @return the Disponible
    */
    public boolean isDisponible() {
        return disponible;
    }
    /**
    * Sets the Disponible.
    *
    * @param Disponible the new Disponible
    */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
////////////////////// CONSTRUCTOR \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\   
        /**
	 * Instantiates a new pelicula.
	 *
	 * @param id the id
	 * @param edadMin the edadMin
	 * @param director the director
	 * @param precio the precio
	 * @param titulo the titulo
	 * @param disponible the disponible
	 */
    public Pelicula(String id, int edadMin, String director, double precio, String titulo, boolean disponible) {
        this.id = id;
        this.edadMin = edadMin;
        this.director = director;
        this.precio = precio;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    /**
	 * Metodo que devuelve  toda la informacion sobre la pelicula
	 *
	 * @return informacion sobre la pelicula: id, edadMin, director, precio, titulo, disponible
	 */
    @Override
    public String toString() {
        
        String frase= "Pelicula{" + "\n"+
                      "id=" + id + "\n"+
                      ", edadMin=" + edadMin + "\n"+
                      ", director=" + director + "\n"+
                      ", precio=" + precio + "\n"+
                      ", titulo=" + titulo + "\n"+
                      ", disponible=" + disponible ;
        return frase; 
    }
    
    
    
    
}
