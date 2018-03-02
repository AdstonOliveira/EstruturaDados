package Recursividade;

public class Ex5 {

   static int somaVetor(int[] vet, int n){
      
      if( n > 0){
         return (vet[n-1] + somaVetor(vet, n-1));
      }else
         return 0;
         
   }

   public static void main( String[] args ) {
      int[] vetor = { 2,2,2,2,2 };
      
      System.out.println( Ex5.somaVetor(vetor, vetor.length) ) ;
   }
   
   
}
