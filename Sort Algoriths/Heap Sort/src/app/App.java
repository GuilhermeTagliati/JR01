package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sort[] = {12, 11, 13, 5, 6, 7}; 
        int n = sort.length; 

        HeapSort ob = new HeapSort(); 
        ob.sort(sort); 

        System.out.println("Array Reorganizado"); 
        
        for (int i=0; i<n; ++i) {
            System.out.print(sort[i]+" ");
        }
    }
}