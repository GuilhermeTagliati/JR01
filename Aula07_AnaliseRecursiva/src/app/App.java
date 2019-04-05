package app;

import java.util.Scanner;

java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Resultado: "+ fun(n));
        in.close();
    }
    public static int fun(int n){
        if( n == 2)
            return 2;
        return 2 * fun(n-1) +3;
    }
}