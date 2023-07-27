package Part_7.Sorting;

import java.util.Arrays;

public class Sort {
    private int[] numList;

    public Sort(int[] numList) {
        this.numList = numList;
    }

    public int smallest() {
        int smallest = this.numList[0];
        for (int n: this.numList) {
            if (n < smallest) {
                smallest = n;
            }
        }
        return smallest;
    }

    public int indexOfSmallest() {
        int smallest = smallest();
        int len = this.numList.length;
        int i = 0;
        int index = 0;

        while (i < len) {
            if (this.numList[i] == smallest) {
                index = i;
            }
            i++;
        }
        return index;
    }

    public int indexOfSmallestFrom(int startIndex) {
        int index = startIndex;
        int smallest = this.numList[index];

        for (int i = startIndex; i < this.numList.length; i++) {
            if (this.numList[i] < smallest) {
                smallest = this.numList[i];
                index = i;
            }
        }
        return index;
    }

    public void swap(int indexOne, int indexTwo) {
        int numOne = numList[indexOne];
        int numTwo = numList[indexTwo];

        numList[indexOne] = numTwo;
        numList[indexTwo] = numOne;
    }

    public void sort() {
        System.out.println(Arrays.toString(numList));
        int smallestIndex = indexOfSmallest();

        swap(0, smallestIndex);

        int startIndex = 1;
        int length = numList.length - 1;

        while (startIndex <= length) {
            System.out.println(Arrays.toString(numList));
            smallestIndex = indexOfSmallestFrom(startIndex);
            swap(startIndex, smallestIndex);
            startIndex++;
        }
    }
}
