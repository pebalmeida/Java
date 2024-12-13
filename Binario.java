package binario;



public class Binario{

    public static void main(String[] args){
        
       decimal_Binario(789);

    }

    private static void decimal_Binario(int n){
        if(n > 0){
            decimal_Binario( n / 2);
            System.out.print(n % 2);
        }
    }
}

