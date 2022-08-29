/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto1;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public class lista {
    
    public static void main (String[]args){
        
        List<ClsVendedores2>misEmp=new ArrayList();
        
        
       ClsVendedores2 ven = new ClsVendedores2();

        ven.setNombre("Marcos");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
        
        
        
        ven.setNombre("Rosa");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
        
        
        
        ven.setNombre("Fatima");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
       
        
        
        ven.setNombre("Marta");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
       
        
       
        ven.setNombre("Roman");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
        
        
        
        ven.setNombre("Carlin");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
        
        
        
       
        ven.setNombre("Alondra");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
       
        
        
        
        ven.setNombre("Manuel");
        ven.setEnero(r());
        ven.setFebrero(r());
        ven.setMarzo(r());
        misEmp.add(ven);
        ven = new ClsVendedores2();
        
        
       double sumaEnero = 0;
       double sumaFebrero =0;
       double sumaMarzo=0;
       double Totalventas=0;
       
       
       for (ClsVendedores2 v : misEmp){
           System.out.println("Nombre :"+v.getNombre()+"\t\t");        
           System.out.println("Enero : "+v.getEnero()+"\t\t");
           System.out.println("Febrero : "+v.getFebrero()+"\t\t");
           System.out.println("Marzo: "+v.getMarzo()+"\t\t");
           
           sumaEnero = sumaEnero +v.getEnero();
           sumaFebrero = sumaFebrero +v.getFebrero();
           sumaMarzo = sumaMarzo +v.getMarzo();
           
       }
        
       
       Totalventas=sumaEnero+sumaFebrero+sumaMarzo;
       System.out.println("TOTAL DE VENTAS: "+ (sumaEnero+sumaFebrero+sumaMarzo));
    
    }
    
     public static int r (){
         int Random =0;
         int n = (int) (Math.random()*3000+1);
         return n;
    }

    
    public static void imprimir(Collection coleccion){
        for (Object elemento: coleccion){
            System.out.println("elemento = " + elemento);
            
        }
    }

   
    
}
    
    
    
    

