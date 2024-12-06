 class Meto {
     public static void main(String[] args) {
         soma();
         subtracao(3000, 15);
         multiplicacao(89.70f, 1.123f);
         divisao(0.023f, 2.2f);


     }

     public static void soma() {
         int a = 25;
         int b = 5;
         System.out.println(a + b);
     }

     public static void subtracao(int a, int b) {
         a = 3000;
         b = 15;
         System.out.println(a - b);


     }

     public static void multiplicacao(float x, float y) {
         x = 89.70f;
         y = 1.123f;
         System.out.println(x * y);

     }

     public static void divisao(float k, float m) {
         k = 0.023f;
         m = 2.2f;
         System.out.println(k / m);

     }

 }