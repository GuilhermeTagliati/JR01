 
 /**
  * mSort
  */
 public class mSort {

    public static void merge(int arr[], int l, int m, int r) 
    { 
        // Encontra o tamanho dos arrays que serao somados
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Cria arrays secundarios
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        // Copia os dados para os arrays
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        // Inicializacao dos contadores dos dois subarrays
        int i = 0, j = 0; 
  
        // inicializacao do contador do array agregado de l e m
        int k = l; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                arr[k] = L[i]; 
                i++; 
            } 
            else{ 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copia os elementos de L[]
        while (i < n1){ 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Copia os elementos de R[]
        while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Merge Sort Utilizando a funcao merge
    public static void sort(int arr[], int l, int r) { 
        if (l < r){ 
            // Encontra o ponto medio
            int m = (l+r)/2; 
  
            // Organiza as duas metades 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Junta as duas metades do array
            merge(arr, l, m, r); 
        } 
    }   
    //Print Array
    public static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Main
    public static void main(String args[]) { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Array dado"); 
        printArray(arr); 
  
        sort(arr, 0, arr.length-1); 
  
        System.out.println("\nArray Organizado"); 
        printArray(arr); 
    } 
} 
