package Recursividade;
public class Ex1 {

   static int somatorio(int n){
      int soma = 0;
      
      if( n > 0 ){
         soma += n + somatorio( n - 1 );
         return soma;
      }else
         return 0;
   }

   public static void main( String[] args ) {
      System.out.println(Ex1.somatorio(5));
   }


   
}
