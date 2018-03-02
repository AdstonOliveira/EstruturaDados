package Aula10022018;


import java.util.Random;
import java.util.Scanner;

   public class Ex2 {


      private int limite;   //M
      private int[] vetor;
      
      public void setTamanho(int n){
         this.vetor = new int[n];
      }
      
      public void setTamanho(){
         System.out.println("Insira o tamanho do vetor: ");
            Scanner scanner = new Scanner(System.in);
               this.vetor = new int[scanner.nextInt()];
      }
      
      public void setLimite(int m){
         this.limite = m;
      }
      
      public void setLimite(){
         System.out.println("Insira o limite de valor: ");
            Scanner scanner = new Scanner(System.in);
               this.limite = scanner.nextInt();
      }

      public void preencheVetorAuto(){
         Random random = new Random();
         
         for(int i = 0; i < this.vetor.length; i++){
            int valor = random.nextInt(this.limite);
               while(valor < 0)
                  valor = random.nextInt(this.limite);
               
            this.vetor[i] = valor;
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
         
         Ex2 ex2 = new Ex2();
         
         ex2.setTamanho(5);
         ex2.setLimite(100);
         ex2.preencheVetorAuto();
         
         ex2.exibe();
         ex2.exibeInverso();
      }
}
