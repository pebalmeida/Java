import java.util.Scanner;

public class Maior {
    public static void main(String args[]){
        int X, Y, R;
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Entre com o valor de X :");
        X = s.nextInt();
        System.out.print("Entre com o valor de Y :");
        Y = s.nextInt();
        R = X - Y;
        System.out.println();
        if (X > Y){
            System.out.print("Resultado = " + R);
            System.out.println();
        }
    }
}
