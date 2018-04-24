
package Aula09032018;

public class Main {

public static void heapSort(int[] v) {
        buildMaxHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
        }
    }
    private static void buildMaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);

    }
    private static void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor){  

         int max = 2 * pos + 1, right = max + 1;  
         if (max < tamanhoDoVetor)  
         {  

             if (right < tamanhoDoVetor && vetor[max] < vetor[right])  
                 max = right;

             if (vetor[max] > vetor[pos])  
             {  
                 swap(vetor, max, pos);  
                 maxHeapify(vetor, max, tamanhoDoVetor);  
             }  
         }  
     }
    static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    static void CountingSort(Integer[] array, int leftIndex, int rightIndex) {
		
		//Encontrar o maior valor 
		int k = 0;
		for(int m = leftIndex; m < rightIndex; m++){
			if(array[m] > k){
				k = array[m];
			}
		}
		
		//Cria vetor com o tamanho do maior elemento
		int[] vetorTemporario = new int[k];
		
		//Inicializar com zero o vetor temporario
		for(int i = 0; i < vetorTemporario.length; i++){
			vetorTemporario[i] = 0;
		}
		
		//Contagem das ocorrencias no vetor desordenado
		for(int j = leftIndex; j < rightIndex; j++){
			vetorTemporario[array[j]] += 1;
		}
		
		//Fazendo o  complemento do numero anterior 
		for(int i = leftIndex; i < k; i++){
			vetorTemporario[i] = vetorTemporario[i] + vetorTemporario[i - 1];
		}
		
		//Ordenando o array da direita para a esquerda
		int[] vetorAuxiliar = new int[array.length];
		for(int j = rightIndex; j > leftIndex; j--) {
			vetorAuxiliar[vetorTemporario[array[j]]] = array[j];
			vetorTemporario[array[j]] -= 1; 
		}
		
		//Retornando os valores ordenados para o vetor de entrada
		for (int i = leftIndex; i < rightIndex; i++){
			array[i] = vetorAuxiliar[i];
		}
	}
    
    static int[] aleatorio(int limite){
        int vetRand[] = new int[limite];
        
            for(int i=0; i < limite; i++)
                vetRand[i] = ((int) (Math.random()*limite*10))+1;
        
        return vetRand;
    }
    
    static int[] sequencial(int limite){
        int vetRand[] = new int[limite];
        
            for(int i=0; i < limite; i++)
                vetRand[i] = i;
        
        return vetRand;
    }
    static int[] maiorMenor(int limite){
        int vetRand[] = new int[limite];
        int j = 0;
        
            for(int i = limite ; i > 0; i--){
                vetRand[j] = i;
                j ++;
            }
                
        return vetRand;
    }
    
    static void bubble_ruim(int vet[], int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<(N-1); j++){
                if(vet[j]>vet[j+1]){
                   troca(vet,j,j+1);
                }
            }
        }
    }
    static void bubble_bom(int vet[], int N){
       // implemente
       boolean trocou = true;
       int j = N - 1;
       
       while(trocou){
           trocou = false;
           
                for( int i = 0; i < j; i++ ){
                    if( vet[i] > vet[i+1] ){
                        troca(vet,i,i+1);
                        trocou = true;
                    }
                }
                   j--;
        }
           
    }
    
    static void selection(int[] vet, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
    }
    static void insertionSort(int[] vetor){
		for (int i = 1; i < vetor.length; i++){
        		int aux = vetor[i];
			int j = i;
		while ((j > 0) && (vetor[j-1] > aux)){
			vetor[j] = vetor[j-1];
			j -= 1;
		}
		vetor[j] = aux;
                
		}
	}

    static void quickSort(int v[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        while (esq <= dir) {
            while (v[esq] < pivo) {
                esq = esq + 1;
            }
            while (v[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda) {
            quickSort(v, esquerda, dir);
        }
        if (esq < direita) {
            quickSort(v, esq, direita);
        }
    }
    
    
    static void exibe(int vet[]){
        for(int each : vet)
            System.out.println(each);
    }
    static void troca(int vet[],int i, int j){
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
        
    
    public static void main(String[] args) {
        
    int N = 20000;
        
        int vet1Rand[] = aleatorio(N);
        int[] vet2Rand = vet1Rand.clone();
        int[] vet3Rand = vet1Rand.clone();
        int[] vet4Rand = vet1Rand.clone();
        int[] vet5Rand = vet1Rand.clone();
        int[] vet6Rand = vet1Rand.clone();
    //****************** Aleatório *******************
        System.out.println("****************** Aleatórios *******************");
        long inicio = System.currentTimeMillis();
        bubble_ruim(vet1Rand,N);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo Bubble Ruim: "+tempo);
        
        inicio = System.currentTimeMillis();
        bubble_bom(vet2Rand,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble BOM: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        heapSort(vet3Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo heapSort: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        selection(vet4Rand, N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Selection: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        insertionSort(vet5Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo insertion: "+tempo);       
   //        ##########################     
        inicio = System.currentTimeMillis();
        quickSort(vet6Rand,0,N-1);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Quick: "+tempo);

        
        vet1Rand= sequencial(N);
        vet2Rand = vet1Rand.clone();
        vet3Rand = vet1Rand.clone();
        vet4Rand = vet1Rand.clone();
        vet5Rand = vet1Rand.clone();
        vet6Rand = vet1Rand.clone();
        
        System.out.println("****************** Sequencial *******************");
        inicio = System.currentTimeMillis();
        bubble_ruim(vet1Rand,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble Ruim: "+tempo);
        
        inicio = System.currentTimeMillis();
        bubble_bom(vet2Rand,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble BOM: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        heapSort(vet3Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo heapSort: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        selection(vet4Rand, N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Selection: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        insertionSort(vet5Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo insertion: "+tempo);    
    //      ##############################
        inicio = System.currentTimeMillis();
        quickSort(vet6Rand,0,N-1);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Quick: "+tempo);
    //      ##############################
        
        //****************** Maior Menor *******************
    
        vet1Rand= maiorMenor(N);
        vet2Rand = vet1Rand.clone();
        vet3Rand = vet1Rand.clone();
        vet4Rand = vet1Rand.clone();
        vet5Rand = vet1Rand.clone();
        vet6Rand = vet1Rand.clone();
        
        System.out.println("****************** Maior Menor *******************");
        inicio = System.currentTimeMillis();
        bubble_ruim(vet1Rand,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble Ruim: "+tempo);
        
        inicio = System.currentTimeMillis();
        bubble_bom(vet2Rand,N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Bubble BOM: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        heapSort(vet3Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo heapSort: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        selection(vet4Rand, N);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Selection: "+tempo);
   //        ##########################
        inicio = System.currentTimeMillis();
        insertionSort(vet5Rand);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo insertion: "+tempo);    
    //      ##############################
        inicio = System.currentTimeMillis();
        quickSort(vet6Rand,0,N-1);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo Quick: "+tempo);
        
    }
}