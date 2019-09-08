package app;

/**
 * HeapSort
 */
public class HeapSort {

    public void sort(int array[]) 
    { 
        int n = array.length; 
        
        // Construindo o Heap (Rearranjando as posições do Array) 
        for (int i = n / 2 - 1; i >= 0; i--) {
            makeHeap(array, n, i);
        }
  
        // Retirando os elementos do heap um por um 
        for (int i = n - 1; i >= 0; i--) 
        { 
            // Move o root atual para o final
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp; 
  
            // Chama o makeHeap do heap reduzido
            makeHeap(array, i, 0); 
        } 
    }

    private void makeHeap(int[] array, int n, int i) {

        // Inicia o node root como maior valor
        int largest = i;  

        // Node Esquerdo
        int l = 2*i + 1;
        // Node Direito  
        int r = 2*i + 2; 
  
        // Caso o Node da esquerda for > que root
        if (l < n && array[l] > array[largest]) 
            largest = l; 
  
        // Caso o Node da direita for > que root
        if (r < n && array[r] > array[largest]) 
            largest = r; 
  
        // Se o maior ainda não é root
        if (largest != i) 
        { 
            int swap = array[i]; 
            array[i] = array[largest]; 
            array[largest] = swap; 
  
            // Chamada recursiva da subarvore
            makeHeap(array, n, largest); 
        } 
    }
}