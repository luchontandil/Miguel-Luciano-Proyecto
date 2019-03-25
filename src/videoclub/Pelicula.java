/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author DAW
 */
public class Pelicula {
    
    private String id;
    private int edadMin;
    private String director;
    private double precio;
    private String titulo;
    private boolean disponible;

////////////////////// GET Y SET \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
////////////////////// CONSTRUCTOR \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\   

    public Pelicula(String id, int edadMin, String director, double precio, String titulo, boolean disponible) {
        this.id = id;
        this.edadMin = edadMin;
        this.director = director;
        this.precio = precio;
        this.titulo = titulo;
        this.disponible = disponible;
    }

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
