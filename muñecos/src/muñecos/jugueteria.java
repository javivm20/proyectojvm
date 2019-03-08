/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class jugueteria {

    
    private String nombre;
    private ArrayList<muñeco> almacen= new <muñeco>ArrayList();
    
    public jugueteria(){
        this.nombre="jugueteria123";
        this.almacen= new <muñeco>ArrayList();
    }

    public jugueteria(String nombre, ArrayList<muñeco> almacen) {
        this.nombre = nombre;
        this.almacen = new <muñeco>ArrayList();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<muñeco> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(ArrayList<muñeco> almacen) {
        this.almacen = almacen;
    }
    
    public void registrar(muñeco m){
        almacen.add(m);
    }
    
    public void jugar(int n){
        Scanner s=new Scanner(System.in);
        int a=0;
        System.out.println(this.nombre);
        try{
            
                System.out.println("Que acción quieres realizar?");
                System.out.println("Pulsa 0 para encender");
                System.out.println("Pulsa 1 para comer");
                System.out.println("Pulsa 2 para beber");
                System.out.println("Pulsa 3 para dormir");
                System.out.println("Pulsa 4 para despertar");
                System.out.println("Pulsa 5 para soy un");
                System.out.println("Pulsa 6 para sonido");
                System.out.println("Pulsa 7 para toString");
                System.out.println("Pulsa 8 para salir");
                
                
                while(a<8){
                   a=s.nextInt();
                   switch(a){
                       case 0:
                           almacen.get(n).setEncendido(true);
                           break;
                       case 1:
                           almacen.get(n).comer();
                           System.out.println("Comiendo");
                           break;
                        case 2:
                           almacen.get(n).beber();
                           System.out.println("Bebiendo");
                           break;
                         case 3:
                           almacen.get(n).dormir();
                           System.out.println("Dormir");
                           break;
                        case 4:
                           almacen.get(n).despertar();
                           System.out.println("Despertar");
                           break;
                         case 5:
                           almacen.get(n).soyun();
                           break;
                         case 6:
                           almacen.get(n).sonido();
                           break;
                         case 7:
                             System.out.println(
                             almacen.get(n).toString());
                             break;
                           
                   }
                }        
            
        
    }
        catch(IndexOutOfBoundsException ex){
            System.out.println("En esa posicion no hay nada");
        }
    }
    
    public void contar(){
        int contadorA=0;
        int contadorB=0;
        System.out.println(this.nombre);
        for (int i = 0; i < almacen.size(); i++) {
            if(almacen.get(i) instanceof bebe){
                contadorB++;
            }
            if(almacen.get(i) instanceof animal){
                contadorA++;
            }
        }
        
        System.out.println("Hay "+ contadorA + " animales y " + contadorB + " bebes.");
    }
     public void listar(String estado){
        int contador=0;
        muñeco m;
        System.out.println(this.nombre);
        for (int i = 0; i < almacen.size(); i++) {
            m= (muñeco)almacen.get(i);
            if(estado.equals("apagado")){
                if(m.getEncendido()==false){
                    contador++;
                    System.out.println(m.toString());
                }
            }
            else if(estado.equals("encendido")){
                if(m.getEncendido()==true){
                    contador++;
                    System.out.println(m.toString());
                }
            }
             if(estado.equals("triste")){
                if(m.getSed().equals("Sediento")|| m.getHambre().equals("hambriento")){
                    contador++;
                    System.out.println(m.toString());
                }
            }
            else if(estado.equals("contento")){
                if(m.getHambre().equals("No hay hambre")&&m.getSed().equals("No hay sed")){
                    contador++;
                    System.out.println(m.toString());
                }
            }
            
            System.out.println("Esos son sus datos, en total son: "+contador);
            
        }
    }
     
     public void sonido(int i){
        try{
            if(almacen.get(i) instanceof animal){
                almacen.get(i).sonido();
            }
            else System.out.println("No es un animal");            
        
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("En esa posicion no hay nada");
        }
    }
     
     public void sonido(String tipo){
         for (int i = 0; i < almacen.size(); i++) { 
         if(tipo.equals("perro")){                            
                 if(almacen.get(i) instanceof perro){
                     almacen.get(i).sonido();
                 }
         }
         else if(tipo.equals("gato")){
             if(almacen.get(i) instanceof gato){
                 almacen.get(i).sonido();
             }
         }
         }
     }
     
     public void cargar(){
         try {
            FileReader fr= new FileReader("fichero1.txt");
            BufferedReader entrada= new BufferedReader(fr);
            String s;
 
            while((s = entrada.readLine()) !=null){
                if(s.charAt(0)=='1'){                  
                    almacen.add(new bebe (s, false));
                }
                else if(s.charAt(0)=='2'){
                    almacen.add(new animal(s, false));
                }
                else if(s.charAt(0)=='3'){
                    almacen.add(new perro(s, false));
                }
                else if(s.charAt(0)=='4'){
                    almacen.add(new gato(s, false));
                }
            } 
               
            }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Fichero no encontrado");
        } 
        catch(java.io.IOException ioex) {}
     }
     
     public void escribir(){
    
    try{
        FileWriter fw= new FileWriter("fichero2.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter salida=new PrintWriter(bw);
         for (int i = 0; i < almacen.size(); i++) {
             salida.println(almacen.get(i));
         }
        salida.close();              
        }
        
        catch(java.io.IOException ioex){}      
        }
        
     }


