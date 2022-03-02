package com.company;

public class BinarySquare {

    boolean isSquare(int arr[][], int windowSize, int startRow, int startCol) {
        //check for first row
        for (int i = 0; i < windowSize; i++) {
            if (arr[0][startRow + i] == 0) return false;
        }
        // check for first column
        for (int i = 0; i < windowSize; i++) {
            if (arr[startCol + i][0] == 0) return false;
        }

        // check for last row
        for (int i = 0; i < windowSize; i++) {
            if (arr[startRow + windowSize - 1][i] == 0) return false;
        }

        // check for last column
        for (int i = 0; i < windowSize; i++) {
            if (arr[i][startCol + windowSize - 1] == 0) return false;
        }
        return true;
    }

    int noOfPerfectSquare(int[][] arr, int startRow, int startCol, int window) {

        if(isSquare(arr, startRow, startCol, window)) return 1;
        if (startCol == arr.length - window + 1 || startRow == arr.length - window + 1) return 0;
        return noOfPerfectSquare(arr, startRow + 1, startCol, window) +
                noOfPerfectSquare(arr, startRow, startCol + 1, window);
    }

    void solution() {
        int arr[][] = {
                {1, 0},
                {1, 1}
        };
        int total = 0;
        for (int window = 1; window < arr.length + 1; window++) {
            total += noOfPerfectSquare(arr, 0, 0, window);
        }
        System.out.println(total);
    }

    public static void main(String[] args) {

        new BinarySquare().solution();
    }
}
