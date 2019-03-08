/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;

public class gato extends animal implements Cloneable {
    
        public gato(){
        super();
    }
        public gato(String codigo, boolean encendido){
        super();
    }
  
    
   public void sonido(){
            if (this.getOjos()=="Cerrados"){
            despertar();
            this.setBoca("Abierta");
                System.out.println("GUAU");
            
        }
            else System.out.println("GUAU");
    }
   
   public void soyun() {
        System.out.println("Soy gato");
    }
    
}
