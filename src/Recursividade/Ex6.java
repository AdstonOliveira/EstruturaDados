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
public class Ex6 {
   
   static int menor(int[] vet, int n){
      
      if( n > 0 ){
         int a = vet[n-1];
         
            if( a <= menor( vet, n-1 ) )
               return a;
            else
               return menor( vet, n-1);  
      }else
      
         return vet[n];
      
   }

   public static void main( String[] args ) {
      int[] vet = {10, 120, 3 , 11, 5 , 2, 100 ,2, 10, 13, 1500, 0, 599, 357, 3, 85, 378, 951};
      System.out.println(Ex6.menor(vet, vet.length));
   }


   
}
