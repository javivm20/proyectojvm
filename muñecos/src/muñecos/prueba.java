/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muñecos;

import java.util.Scanner;


public class prueba {
    

    //COMENTARIO PARA MODIFICACIÓN PRA GITHUB (JAVIER)
    
  //este es un nuevo comentario despues del anterior
    public static void main(String[] args) {
        
        
        muñeco m=new muñeco();
        m.setCodigo("1234");

        m.setEncendido(true);
        m.comer();
        m.soyun();
        m.comer();
        m.sonido();
        System.out.println(m.toString());   
        m.beber();
        System.out.println(m.toString());
        muñeco m1= new muñeco();
        System.out.println(m1.toString());
        muñeco p =new perro();
        p.sonido();
        
        muñeco b =new bebe();

        b.setEncendido(true);
        b.sonido();
        b.soyun();
        p.soyun();
        
        jugueteria j = new jugueteria();
        j.registrar(b);
        j.registrar(p);
        
        j.listar("contento");
        j.sonido("perro");
        j.sonido(0);
        j.contar();
        j.cargar();
        j.contar();
        j.jugar(3);
        j.escribir();
    }
}
