public class penjumlahanArray2dimensi {
    public static void main(String[] args) {
        // Matriks A dan B
        int[][] A = {
            {30,501,73},
            {97,110,11},
            {56,4,83}
        };
        
        int[][] B = {
            {23,47,81},
            {0,104,29},
            {54,91,69}
        };

        // Matriks hasil penjumlahan
        int[][] C = new int[3][3];

        // Penjumlahan Matriks A dan B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mencetak hasil
        System.out.println("Hasil Penjumlahan Matriks A dan B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


