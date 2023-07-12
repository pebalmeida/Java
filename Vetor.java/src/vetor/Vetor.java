package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int A[] = new int[20];
		int I;
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		for(I = 0; I <= 19; I++)
		{
			System.out.print("Entre o " + (I + 1) + "o.elemento : ");
			A[I] = s.nextInt();
		}
		
		Arrays.sort(A);
		
		System.out.println();
		for(I = 0; I <= 19; I++)
		{
		
			System.out.printf("%3do. valor = %s\n", I + 1, A[I]);
		}

	}

}
