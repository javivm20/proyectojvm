/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;


public class bebe extends muñeco implements Cloneable {
    
    public bebe(){
        super();
    }
    
    public bebe(String codigo, boolean encendido){
        super(codigo, encendido);
          
    }
    
    
    public void sonido(){
        if (super.getEncendido()==true){
            if (this.getOjos()=="Cerrados"){
            despertar();
            this.setBoca("Abierta");
            if(super.getHambre().equals("hambriento") ||super.getSed().equals("sediento") ){
                System.out.println("Lloros");
            }
            else   System.out.println("Risas");
            
        }
            else {
                if(super.getHambre().equals("hambriento") ||super.getSed().equals("sediento") ){
                System.out.println("Lloros");
            }
            else   System.out.println("Risas");
            }
    
        }
    }
    public void soyun() {
        System.out.println("Soy bebe");
    }
}
