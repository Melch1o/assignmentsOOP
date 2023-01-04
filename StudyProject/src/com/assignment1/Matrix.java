package com.assignment1;
import java.util.Scanner;

// Assignment 1: Matrix Class
public class Matrix {

    private int rows, cols;
    private int[][] matrix;

    public void printOut() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void matrixAddition(Matrix matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] += matrix.at(i, j) ;
            }
        }
    }

    public void multiplyBy(int c) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= c;
            }
        }
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public Matrix(int rows, int cols, int[][] array) {
        this.rows = rows;
        this.cols = cols;
        matrix = array;
    }

    public void setMatrix() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int at(int row, int col) {
        return matrix[row][col];
    }

}
