        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;


public class muñeco implements Cloneable {
    
    private String ojos;
    private String boca;
    private String hambre;
    private String sed;
    private chip chip;
    private int contadorH;
    private int contadorS;
    
    public muñeco(){
        
        chip=new chip();
        ojos="Cerrados";
        boca="Cerrada";
        this.hambre="No hay hambre";
        this.sed="No hay sed";
        this.contadorH=0;
        this.contadorS=0;
    }
     
    public muñeco(String codigo, boolean encendido){
        this.ojos="Cerrados";
        this.boca="Cerrada";
        chip=new chip(codigo, encendido);
        this.hambre="No hay hambre";
        this.sed="No hay sed";
        this.contadorH=0;
        this.contadorS=0;
              
    }
    
    public muñeco(muñeco copia){
        this.chip=copia.chip;
        this.ojos=copia.ojos;
        this.boca=copia.boca;
        this.hambre=copia.hambre;
        this.sed=copia.sed;
        this.contadorH=copia.contadorH;
        this.contadorS=copia.contadorS;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

    public String getCodigo() {
        return chip.getCodigo();
    }

    public void setCodigo(String codigo) {
        this.chip.setCodigo(codigo);
    }
    
    public boolean getEncendido() {
        return chip.getEncendido();
    }

    public void setEncendido(boolean encendido) {
        this.chip.setEncendido(encendido);
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getHambre() {
        return hambre;
    }

    public void setHambre(String hambre) {
        this.hambre = hambre;
    }

    public String getSed() {
        return sed;
    }

    public void setSed(String sed) {
        this.sed = sed;
    }

    public int getContadorH() {
        return contadorH;
    }

    public void setContadorH(int contadorH) {
        this.contadorH = contadorH;
    }

    public int getContadorS() {
        return contadorS;
    }

    public void setContadorS(int contadorS) {
        this.contadorS = contadorS;
    }
    
    
    
    public void dormir(){
        if (chip.getEncendido()==true){
            despertar();
            this.setOjos("Cerrados");
            
        } 
       
    }
    
    public void despertar (){
        if (this.chip.getEncendido()==true){
            this.setOjos("Abiertos");
            this.setBoca("Cerrada"); 
            this.contadorH++;
            this.contadorS++;
            
            if(this.contadorH>=3){
                this.hambre="Hambriento";}
            else if(this.contadorS>=5){
                this.sed="Sediento";
            }
        }
    }
    
    public void comer (){
        if (this.chip.getEncendido()==true){
            if (this.getOjos().equals("Abiertos")){
            this.setOjos("Abiertos");
            this.setBoca("Abierta"); 
            this.contadorH=0;
            this.hambre="No hay hambre";
            this.contadorS++;
            dormir();           
            }
        
            else if (this.getOjos().equals("Cerrados")){
            despertar();
            comer();
        }
        
        }
    }
    
    public void beber (){
        if (chip.getEncendido()==true){
            this.setOjos("Abiertos");
            this.setBoca("Abierta"); 
            this.contadorH++;
            this.contadorS=0;
            this.sed="No hay sed";
        }
        if (this.getOjos().equals("Cerrados")){
            despertar();
            beber();
        }
    }
    
    public void sonido(){
        if (chip.getEncendido()==true){
            if (this.getOjos().equals("Cerrados")){
            despertar();
            this.setBoca("Abierta");
                System.out.println("sonido emitiendose");
            
        }
            else System.out.println("Sonido emitiendose");
    }       
   
    }
    public String toString() {
        return this.chip.toString() + " boca= " + boca + ", ojos= " + ojos + ", hambre=" + hambre + ", Sed=" + sed;
    }

    public void soyun() {
        System.out.println("Soy muñeco");
    }
    
    public Object clone(){
        Object obj=null;
        try{
            obj=(muñeco)super.clone();
        }catch(CloneNotSupportedException ex){}
        System.out.println("No se puede");
    
    ((muñeco)obj).chip=(chip)chip.clone();
     return obj;       
    }
    }
