/**
 * iSort
 */
public class iSort {
    // Function Insertion Sort
    public static void sort(int arr[]){ 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            // Move os Elementos [n, n-1, ...]
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    // Function que apenas da print em array 
    static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    // Main
    public static void main(String args[]){ 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        sort(arr); 
  
        printArray(arr); 
    } 
} /* This code is contributed by Rajat Mishra. */
    
