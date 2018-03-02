package Aula10022018;
import java.util.Scanner;

   public class Ex1 {
   
      private int[] vetor;
      
      public void setTamanho(){
         System.out.println("Insira um tamanho para o "
                 + " vetor: ");
         
         Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
   
            this.vetor = new int[n];
      }
      
      public void setTamanho(int n){
         this.vetor = new int[n];
      }
   
      public void setValores(int values, int i){
         this.vetor[i] = values;
      }
      
      public void setValores(){
         for(int i = 0; i < this.vetor.length; i++){
            
            System.out.println("Valor: ");
               Scanner scanner = new Scanner(System.in);
            
               this.vetor[i] = scanner.nextInt();
         }
      }
      
      public void exibe(){
         for(int each : this.vetor)
            System.out.println(each);
      }
      
      public void exibeInverso(){
         for(int i = this.vetor.length; i > 0; i--){
            System.out.println("Inverso: "  + this.vetor[i-1]);
         }
      }
      
      public static void main( String[] args ) {
         
         Ex1 ex1 = new Ex1();
         ex1.setTamanho(5);
         ex1.setValores();
         
         ex1.exibe();
         ex1.exibeInverso();
         
      }
      
      
}
