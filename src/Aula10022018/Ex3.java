package Aula10022018;


import java.util.Random;
import java.util.Scanner;

   public class Ex3 {
   
      private int limite;
      private int[] vetor;
      private final Random intRandom = new Random();
      
      public void setLimite(){
      
         System.out.println("Insira um limite: ");
         Scanner scanner = new Scanner(System.in);
            this.limite = scanner.nextInt();
      }

      public void setLimite(int limite){
         this.limite = limite;
      }

      public void setVetor(int[] vetor){
         this.vetor = vetor;
      }
      
      public boolean checkIgualdade(int valor, int[] vetor){         
         boolean igual = false;
         
            for(int i = 0; i < vetor.length; i++){
               if(valor == vetor[i]){
                  igual = true;
                  System.out.println("function: " + igual);
                  return igual;
               }
            }
            
            System.out.println("function: " + igual);
         return igual;
      }
      
      public int geraAleatorio(int limite){
         int valor = 0;
         
            while(valor < 1)
               valor = intRandom.nextInt(limite);
         
         return valor;
      }
      
      public void insere_Exclusivo(int[] vetor, int limite){
         int valor;
         vetor[0] = this.geraAleatorio(limite);
         System.out.println("Valor 0: " + vetor[0]);
         
         for(int i = 1; i < vetor.length; i++){
            
            valor = this.geraAleatorio(limite);
            System.out.println("Valor do Teste: " + valor);
               
               while(this.checkIgualdade(valor, vetor)){
                  valor = this.geraAleatorio(limite);
                  System.out.println("Novo valor: " + valor);
               }
               vetor[i] = valor;
               System.out.println("Posicao " + i + " valor adicionado: " + vetor[i]);
         }
         this.vetor = vetor;
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
      
      
      public void ordena(int[] vetor){
         
         for(int i = 0; i < vetor.length; i++)
            for(int j = 0; j < vetor.length; j++)
              
               if(vetor[i] < vetor[j]){
                  int temp = vetor[i];
                  vetor[i] = vetor[j];
                  vetor[j] = temp;
               }
      }
      
      public static void main( String[] args ) {
         
         Ex3 ex3 = new Ex3();
         int tamanho = 10;
         int teste[] = new int[tamanho];
         int range = 100;
          
         ex3.insere_Exclusivo(teste, range);
         ex3.exibe();
         ex3.exibeInverso();
         
         ex3.ordena(teste);
         ex3.exibe();
         ex3.exibeInverso();
         
         
      }
      
      
      
      
      
}
