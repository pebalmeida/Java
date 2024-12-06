class RepM {
    public static void main(String[] args) {
        int matriz[][] = new int[23][23];
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 23; j++) {
                matriz[i][j] = i + j;
            }

        }
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 23; j++) {
                System.out.println(matriz[i][j]);
            }

        }
    }
}