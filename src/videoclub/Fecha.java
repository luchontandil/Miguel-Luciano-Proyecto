/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.Calendar;

/**
 *
 * @author DAW
 */
public class Fecha {
 
   private int dia;
   private int mes;
   private int anyo;
   
////////////////////// GET Y SET \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

////////////////////// CONSTRUCTOR \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        valida();
    }
    
    
 ////////////////////// METODOS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
   
   public boolean bisiesto(){
        
        if ((this.anyo % 4 == 0) && ((this.anyo % 100 != 0) || (this.anyo % 400 == 0)))
            return true;
        else
            return false;
        
        
    }
   
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
    
    
    public String corta(){        
        return this.dia + "-" + this.mes + "-" + this.anyo;         
    }
   
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
