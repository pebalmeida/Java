import java.io.*;
import java.util.Scanner;

class tabuada{

    public static void main(String[] args) {
         int N, I, R;
         Scanner s = new Scanner(System.in);
         System.out.println();
         System.out.println("Programa: Tabuada");
         System.out.println();
         System.out.print("Entre um valor inteiro para o calculo:");
         N = s.nextInt();
         for(I = 1; I <= 60; I++){
             R = N * I;
             System.out.printf("%3d X %2d = %3d\n", N, I, R);
         }
        
    }
}