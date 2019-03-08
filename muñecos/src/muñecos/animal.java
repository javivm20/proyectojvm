/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;


public class animal extends muñeco implements Cloneable{
    private String tipo;
    
    public animal(){
        
        super();
        this.tipo="domestico";
    }
    
    public animal(String codigo, boolean encendido){
        super(codigo, encendido);

           
    }
    
    public String gettipo(){
        return tipo;
    }
    
    public void settipo(String tipo){
        this.tipo=tipo;
    }
    
    public void soyun() {
        System.out.println("Soy animal");
    }
}
