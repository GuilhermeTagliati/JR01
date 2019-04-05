
public class sSort {

    public static void sort(int arr[]) { 
        int n = arr.length; 
        // Move os elementos do array um por um 
        for (int i = 0; i < n-1; i++) { 
            // Encontra o menor elemento no array
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Troca o menor valor do array com o elemento do primeiro endereco 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
    // Print array 
    public static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Main 
    public static void main(String args[]){ 
        int arrbestcase[] = {11,12,22,25,64}; 
        int arrworstcase[] = {64,25,12,22,11}; 
        sort(arrbestcase); 
        System.out.println("Melhor caso: "); 
        printArray(arrbestcase); 
        sort(arrworstcase); 
        System.out.println("Pior caso: "); 
        printArray(arrworstcase); 
    } 

}