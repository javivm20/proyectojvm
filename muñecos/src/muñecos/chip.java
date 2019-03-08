/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;


public class chip implements Cloneable {
    
    private String codigo;
    private boolean encendido;
    
    public chip(){
        codigo=codigo;
        encendido=false;
    }
    
    public chip(String codigo, boolean encendido){
        this.codigo=codigo;
        this.encendido=encendido;
    }
    
 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public String toString() {
        return "chip " + "codigo=" + codigo + ", encendido=" + encendido;
    }
    
    public chip clone(){
        Object obj=null;
        try{
            obj=super.clone();
         }catch(CloneNotSupportedException ex){}
        return (chip)obj;
       }
    
}
 