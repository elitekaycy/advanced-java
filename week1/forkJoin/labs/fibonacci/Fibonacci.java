package week1.forkJoin.labs.fibonacci;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Exercise #1: Parallel Fibonacci Calculation with Fork/Join Framework
 *
 * Objective:
 * This lab explores the Fork/Join Framework in Java for parallel processing.
 * You will implement a program to calculate the Fibonacci sequence of a large
 * number using a recursive ForkJoinTask.
 * Background:
 * The Fibonacci sequence is defined as follows:
 * F(n) = F(n-1) + F(n-2), where F(0) = 0 and F(1) = 1
 * Calculating the Fibonacci sequence for large numbers can be computationally
 * expensive. The Fork/Join Framework provides a mechanism to parallelize this
 * task by breaking it down into smaller subproblems.
 */

public class Fibonacci extends RecursiveTask<Integer> {

  private final int n;

  public Fibonacci(int n) {
    this.n = n;
  }

  @Override
  protected Integer compute() {
    if (n == 0)
      return n;
    if (n == 1)
      return n;

    Fibonacci left = new Fibonacci(n - 1);
    left.fork();

    Fibonacci right = new Fibonacci(n - 2);
    right.fork();

    return left.join() + right.join();
  }

  public static void main(String[] args) {

    try (ForkJoinPool forkJoinPool = new ForkJoinPool(2)) {
      Fibonacci task = new Fibonacci(20);
      int result = forkJoinPool.invoke(task);

      System.out.println("results is ...");
      System.out.println(result);
    }

  }

}
