/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.t01.p1;
import java.util.*; 
/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double CAL1,CAL2,CAL3,CAL4,CAL5,PROM;
      String RES;
      Scanner datos= new Scanner(System.in);//Ingresar los datos 
          System.out.println("Ingrese la calificación 1");
             CAL1= datos.nextDouble();
               System.out.println("Ingrese la calificación 2");
                  CAL2= datos.nextDouble();
               System.out.println("Escribe la calificación 3");
                  CAL3= datos.nextDouble();
               System.out.println("Escribe la calificación 4");
                  CAL4= datos.nextDouble();
               System.out.println("Escribe la calificación 5");
                  CAL5= datos.nextDouble();
        
        //Calcular el promedio
        PROM=(CAL1+CAL2+CAL3+CAL4+CAL5)/5;
     
          if(PROM>=7){
           RES=("APROBADO");
              System.out.println("El alumno está" + RES + " ¡Felicidades!");
          }
          else{
           RES=("REPROBADO");
              System.out.println("El alumno está: " + RES + " Sigue participando ");
          }
          
          
    }
    
}
