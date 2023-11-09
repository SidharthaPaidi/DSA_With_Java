public class SpiralMatrix {
    public static void Spiral(int arr[][]) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;
        while (sr <= er && sc <= ec) {
            // top
            for (int i = sc; i <=ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            // right
            for (int j = sr + 1; j <=er; j++) {
                System.out.print(arr[j][ec] + " ");

            }
            // bottom
            for (int i = ec - 1; i >=sc; i--) {
                System.out.print(arr[er][i] + " ");
            }
            // left
            for (int j = er - 1; j >=sr + 1; j--) {
                System.out.print(arr[j][sc] + " ");
            }
            sc++;
            sr++;
            er--;
            ec--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Spiral(matrix);
    }
}
