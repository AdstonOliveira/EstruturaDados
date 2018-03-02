package Recursividade;

public class Ex2 {
   
   static int pot(int x, int n){
      
      if(n > 0){
         return x * pot(x, n-1);
      }else
         return 1;
      
   }
   
   public static void main( String[] args ) {
      System.out.println(Ex2.pot(5, 4));
   }
   
}
