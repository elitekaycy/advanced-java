# Parallel Matrix Multiplication using Fork/Join Framework

## Overview

In this exercise, I implement parallel matrix multiplication using Java's Fork/Join framework. Matrix multiplication can be computationally intensive, especially for large matrices. By breaking down the multiplication into smaller subtasks and executing them concurrently, the Fork/Join framework allows for efficient utilization of multi-core processors.

## Components

- **MatrixMultiplier Class**: Extends `RecursiveTask<Matrix>` to perform matrix multiplication recursively.
  - **compute()**: Divides the matrices into smaller submatrices and uses `fork()` and `join()` to execute subtasks concurrently.
  - **combineSubMatrices()**: Combines the results from the submatrices to compute the final result.
  - **getSubMatrix()**: Retrieves a submatrix from a given matrix.
  - **multiply()**: Performs traditional matrix multiplication for submatrices smaller than the threshold.

## Usage

### 1. Run the Code

Compile the Java file using the following command in your terminal:

```bash
java MatrixMultiplier
```
