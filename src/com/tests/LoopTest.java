package com.tests;

public class LoopTest {
    public void execFunc(int minNumb, int maxNumb) {
        int x = RandomNumber(minNumb, maxNumb);
        int y = RandomNumber(minNumb, maxNumb);
        int[][] grid = new int[x][y];

        getGridRandomNumbers(grid, minNumb, maxNumb);
        printOutGrid(grid);
    }

    public static int[][] getGrid(int xSize, int ySize, int minNumb, int maxNumb){
        int[][] grid = new int[xSize][ySize];
        getGridRandomNumbers(grid, minNumb, maxNumb);
        return grid;
    }

    public static void printOutGrid(int[][] grid){
        for(int h = 0; h < grid.length; h++) {
            for (int v = 0; v < grid[0].length; v++) {
                System.out.print(grid[h][v] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getGridRandomNumbers(int[][] grid, int minNumb, int maxNumb){
        for(int h = 0; h < grid.length; h++) {
            for (int v = 0; v < grid[0].length; v++) {
                grid[h][v] = RandomNumber(minNumb, maxNumb);
            }
        }
        return grid;
    }

    public static int RandomNumber(int min, int max){
        return (int)((Math.random() * ((max - min)+1)) + min);
    }
}
