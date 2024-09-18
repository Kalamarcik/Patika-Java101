package org.example;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;
    private int[][] board;
    private boolean[][] revealedCells;
    private boolean gameOver;
    private int maxRevealedCells;


    public MineSweeper() {
        this.gameOver = false;
    }

    private void createBoard() {
        board = new int[row][col];
        revealedCells = new boolean[row][col];
        placeMines();
    }

    private void placeMines() {
        Random rand = new Random();
        int mineCount = (col * row) / 4;

        for (int i = 0; i < mineCount; i++) {
            int x, y;

            do {
                x = rand.nextInt(row);
                y = rand.nextInt(col);
            } while (board[x][y] == -1);

            board[x][y] = -1;
        }

        this.maxRevealedCells = (row * col) - mineCount;
    }

    private int countAdjacentMines(int x, int y) {
        int counter = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                // Boundary checks
                if (i >= 0 && i < row && j >= 0 && j < col) {
                    // Avoid the original cell
                    if (!(i == x && j == y) && board[i][j] == -1) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public void revealCell(int x, int y) {

        if (gameOver) {
            return;
        }
        if (x < 0 || x >= row || y < 0 || y >= col) {
            System.out.println("Invalid coordinates.");
            return;
        }

        if (revealedCells[x][y]) {
            System.out.println("This cell is already revealed.");
            return;
        }


        if (board[x][y] == -1) {
            System.out.println("You hit a mine. Game over.");
            gameOver = true;
            revealedCells[x][y] = true;
            displayBoard();
            System.out.println("Game over. You can't reveal any more cells.");
            showOnlyMines();
            return;
        }

        int adjacentMineCount = countAdjacentMines(x, y);
        board[x][y] = adjacentMineCount;
        revealedCells[x][y] = true;
        maxRevealedCells--;
        displayBoard();

        if (maxRevealedCells == 0) {
            System.out.println("Congratulations! You've won the game.");
            gameOver = true;
        }
    }

    private void showOnlyMines() {
        System.out.println("Board Status");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private void displayBoard() {

        System.out.println("Board Status:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (revealedCells[i][j]) {
                    if (board[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("=======================");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the Minesweeper board: ");
        System.out.print("Enter row count:");
        row = scanner.nextInt();
        System.out.print("Enter column count:");
        col = scanner.nextInt();

        while (row < 2 || col < 2) {
            System.out.println("Row and column count must be at least 2.");
            System.out.println("Enter the number of rows and columns for the Minesweeper board: ");
            System.out.print("Enter row count:");
            row = scanner.nextInt();
            System.out.print("Enter column count:");
            col = scanner.nextInt();
        }

        createBoard();
        displayBoard();

        while (!this.gameOver) {
            System.out.println("Enter row and column coordinates: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            this.revealCell(x, y);
        }
    }
}
