package week1.forkJoin.labs;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MatrixMultiplication extends RecursiveTask<int[][]> {

  private final int[][] gridA;
  private final int[][] gridB;
  private final int rowsA;
  private final int colsA;
  private final int colsB;

  private final int startRow;
  private final int endRow;

  public MatrixMultiplication(int[][] a, int[][] b, int rowsA, int colA, int colB, int startRow, int endRow) {
    this.gridA = a;
    this.gridB = b;
    this.rowsA = rowsA;
    this.colsA = colA;
    this.colsB = colB;
    this.endRow = endRow;
    this.startRow = startRow;
  }

  @Override
  protected int[][] compute() {

    if (rowsA == 1 || colsB == 1) {
      int[][] result = new int[rowsA][colsB];

      for (int i = startRow; i < endRow; i++) {
        for (int j = 0; j < colsB; j++) {
          result[i][j] = gridA[i][0] * gridB[0][j];
        }
      }

      return result;
    }

    else {
      int midRow = (startRow + endRow) / 2;
      int midCol = colsB / 2;

      MatrixMultiplication task1 = new MatrixMultiplication(gridA, gridB, midRow, colsA, midCol, startRow, midRow);
      MatrixMultiplication task2 = new MatrixMultiplication(gridA, gridB, midRow, colsA, colsB, startRow, midRow);
      MatrixMultiplication task3 = new MatrixMultiplication(gridA, gridB, rowsA, colsA, midCol, midRow, endRow);
      MatrixMultiplication task4 = new MatrixMultiplication(gridA, gridB, rowsA, colsA, colsB, midRow, endRow);

      task1.fork();
      task2.fork();
      task3.fork();
      task4.fork();

      int[][] result1 = task1.join();
      int[][] result2 = task2.join();
      int[][] result3 = task3.join();
      int[][] result4 = task4.join();

      int[][] resultSubGrid = new int[endRow - startRow][colsB];
      for (int i = 0; i < midRow - startRow; i++) {
        System.arraycopy(result1[i], 0, resultSubGrid[i], 0, midCol);
        System.arraycopy(result2[i], 0, resultSubGrid[i], midCol, colsB - midCol);
      }

      for (int i = midRow - startRow; i < endRow - startRow; i++) {
        System.arraycopy(result3[i], 0, resultSubGrid[i], 0, midCol);
        System.arraycopy(result4[i], 0, resultSubGrid[i], midCol, colsB - midCol);
      }

      return resultSubGrid;
    }
  }

  public static void main(String[] args) {
    int[][] a = { { 1, 2 }, { 4, 5 } };
    int[][] b = { { 1, 2 }, { 3, 4 } };

    try (ForkJoinPool pool = ForkJoinPool.commonPool()) {
      MatrixMultiplication matrixMultiplicationTask = new MatrixMultiplication(a, b, a.length, a[0].length, b[0].length,
          0, a.length);
      int[][] result = pool.invoke(matrixMultiplicationTask);

      System.out.println("result is ");
      for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
          System.out.print(result[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
