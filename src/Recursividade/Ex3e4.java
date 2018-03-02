package Recursividade;
public class Ex3e4 {

   //EXERCICIOS 3 E 4 
   
   static void oCrescente( int n ){
      
      if(n >= 0){
         oCrescente( n-1 );
         System.out.println( n );
      }
   }
   
   static void oDecrescente( int n ){
      
      if(n >= 0){
         System.out.println( n );
         oDecrescente( n-1 );
      }
      
   }

   public static void main( String[] args ) {
   
      Ex3e4.oCrescente(15);
      Ex3e4.oDecrescente(15);
      
   }
   
}
