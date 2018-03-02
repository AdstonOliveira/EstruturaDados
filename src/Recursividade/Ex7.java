/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;


/**
 *
 * @author Adston Oliveira LinhaVerde Informatica
 */
public class Ex7 {

   static void dec2Bin(int number){     
      int aux = number;
      int bin;
      
      if( aux >= 1 ){
         bin = aux % 2;
         aux /= 2;
         dec2Bin(aux);
         System.out.print(bin);
      }
       /*else
         System.out.print(0);*/
   
   }



   public static void main( String[] args ) {
      
      for(int i = 0; i < 16; i++){
         System.out.println( "Numero: " + i + ": " );
         Ex7.dec2Bin(i) ;
         System.out.println("");
   
      }
   }

}