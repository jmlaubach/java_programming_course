package Part_12.MagicSquare;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        MagicSquare square = new MagicSquare(matrix);

        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfDiagonals());

        System.out.println(square.isMagic());
    }
}
