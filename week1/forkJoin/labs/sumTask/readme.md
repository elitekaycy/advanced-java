# Parallel Summation of an Array using Fork/Join Framework

## Overview

In this exercise, I implement parallel summation of an array using Java's Fork/Join framework. Summing elements of a large array can be computationally intensive. By dividing the array into smaller subarrays and using parallel processing, the Fork/Join framework enables efficient utilization of multi-core processors.

## Components

- **SumTask Class**: Extends `RecursiveTask<Long>` to compute the sum of array elements recursively.
  - **compute()**: Divides the array into smaller subarrays if it exceeds a threshold (`THRESHOLD`), and uses `fork()` and `join()` to execute subtasks concurrently.
  - **main()**: Creates an example array, initializes it, and computes the sum using a ForkJoinPool with a parallelism level of 4.

## Usage

### 1. Run the Code

Compile the Java file using the following command in your terminal:

```bash
java SumTask
```
