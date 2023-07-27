package Part_12.MagicSquare;

import java.util.ArrayList;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int[][] squarePassed) {
        this.square = squarePassed;
    }
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();

        int sum = 0;

        for(int row = 0; row < this.square.length; row++) {
            for(int column = 0; column < this.square[row].length; column++) {
                int x = this.square[row][column];
                sum += x;
            }
            rowSums.add(sum);
            sum = 0;
        }
        return rowSums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> columnSums = new ArrayList<>();

        int sum = 0;

        for (int column = 0; column < this.square.length; column++) {
            for(int row = 0; row < this.square.length; row++) {
                int x = this.square[row][column];
                sum += x;
            }
            columnSums.add(sum);
            sum = 0;
        }
        return columnSums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagonalSums = new ArrayList<>();

        int sum = 0;

        for(int diags = 0; diags < 2; diags++) {
            for(int x = 0; x < this.square.length; x++) {
                int value = this.square[x][x];
                sum += value;
            }
            diagonalSums.add(sum);
            sum = 0;
        }
        return diagonalSums;
    }

    public boolean isMagic() {
        for(int i: sumsOfRows()) {
            if (i != 15) {
                return false;
            }
        }
        for(int i: sumsOfColumns()) {
            if (i != 15) {
                return false;
            }
        }
        for(int i: sumsOfDiagonals()) {
            if (i != 15) {
                return false;
            }
        }
        return true;
    }
}
