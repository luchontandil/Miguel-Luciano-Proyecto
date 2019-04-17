
package videoclub;

import java.util.Calendar;

/**
 *
 * @author Miguel
 */
public class Fecha {
    /** 
     * nuemro entero que hace referencia a un dia
     * The dia. 
     */
   private int dia;
   /** 
     * nuemro entero que hace referencia a un mes
     * The mes. 
     */
   private int mes;
   /** 
     * nuemro entero que hace referencia a un anyo
     * The anyo. 
     */
   private int anyo;
   
////////////////////// GET Y SET \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
   /**
    * Gets the  dia.
    *
    * @return the dia
    */
    public int getDia() {
        return dia;
    }
     /**
    * Sets the dia.
    *
    * @param dia the new dia
    */
    public void setDia(int dia) {
        this.dia = dia;
    }
     /**
    * Gets the  mes.
    *
    * @return the mes
    */
    public int getMes() {
        return mes;
    }
     /**
    * Sets the mes.
    *
    * @param mes the new mes
    */
    public void setMes(int mes) {
        this.mes = mes;
    }
     /**
    * Gets the  anyo.
    *
    * @return the anyo
    */
    public int getAnyo() {
        return anyo;
    }
     /**
    * Sets the anyo.
    *
    * @param anyo the new anyo
    */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

////////////////////// CONSTRUCTOR \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /**
	 * Instantiates a new fecha.
	 *
	 * @param dia the dia
	 * @param mes the mes
	 * @param anyo the anyo
	 
	 */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        valida();
    }
    
    
 ////////////////////// METODOS. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
        /**
	 *sirve para calcular si un año es bisiesto o no, es decir,
	 *para calcular si febrero tiene 28 o 29 dias 
	 *duvuelve true si el mes tiene 29 dias y false si tiene 28
	 *  
	 */
   public boolean bisiesto(){
        
        if ((this.anyo % 4 == 0) && ((this.anyo % 100 != 0) || (this.anyo % 400 == 0)))
            return true;
        else
            return false;
        
        
    }
        /**
	 *sirve para calcular si una fecha es valida o no,es decir,
	 *si los datos metidos al crear la fecha son correctos o no 
	 * que el dia este entre 1 y 31 y calcule el mes para tener 30, 31, 28 o 29
         * calcule que el mes esta entre 1 y 12
         * y que el año este entre 1900 y 2200
         * devulve un true si la fecha pasada y un false y un cambio de valor a 0 en el campo incorrecto si la fecha no es correcta
	 */
   public boolean valida(){
        
        boolean fechaOk=true;
        if ((this.anyo<1900) || (this.anyo>2200)) {
            this.anyo=0;
            fechaOk=false;            
        }

        if ((this.mes<1) || (this.mes>12)) {
            this.mes=0;                
            fechaOk=false;            
        }
        
        if ((this.dia<1) || (this.dia>31)) {
            this.dia=0;
            fechaOk=false;            
         
        } else {
            
            if (this.mes==2){
                if ((bisiesto()==false) && (this.dia>28))  {
                    this.dia=0;
                    fechaOk=false;                    
                }
                else if ((bisiesto()) && (this.dia>29))  {
                    this.dia=0;
                    fechaOk=false;                    
                }                
            }
            else if ((this.mes==4) || (this.mes==6) || (this.mes==9) || (this.mes==11)) {
                if (this.dia>30){
                    this.dia=0;
                    fechaOk=false;                    
                } 
            }
        }
            
        return fechaOk;
                
    }
    
        /**
	 *Muestra la fecha que le pasamos con el siguiente formato 
	 *dia-mes-año  
	 */
    public String corta(){        
        return this.dia + "-" + this.mes + "-" + this.anyo;         
    }
    
        /**
	 * Este metodo lo que hace es calcular la diferencia de años que tiene la fecha que le pasas con la fecha actual
	 * utiliza el calendar para saber a que dia estamos hoy y resta el año con el pasado como parametro
         * y depsues calcula mes y dias para saber si el año se a cumplido o n. 
         *
	 */
    public int calcDif(Fecha fecha){
     int anyos=0;
     Calendar ca = Calendar.getInstance();		
     int d = ca.get(Calendar.DATE);
     int m = ca.get(Calendar.MONTH)+1;
     int a = ca.get(Calendar.YEAR);
     
     anyos=a-fecha.getAnyo();
     if(fecha.getMes()<m)anyo--;
     if((fecha.getMes()==m) && (fecha.getDia()<d) )anyo--;   
    
    return anyos;
    }
}
