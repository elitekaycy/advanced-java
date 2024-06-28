# Fibonacci Calculation using Fork/Join Framework

## Overview

In this exercise, I explore the use of Java's Fork/Join framework to calculate the Fibonacci sequence efficiently through parallel processing. The Fork/Join framework allows me to break down the Fibonacci computation into smaller subtasks that can be executed concurrently, leveraging multi-core processors for improved performance.

## Components

- **Fibonacci Class**: Extends `RecursiveTask<Integer>` to compute the Fibonacci number recursively.
  - **compute()**: Divides the Fibonacci calculation into smaller tasks (`Fibonacci(n-1)` and `Fibonacci(n-2)`) and uses `fork()` and `join()` to handle subtask execution and result aggregation.

## Usage

### 1. Run the Code

Compile the Java file using the following command in your terminal:

```bash
java Fibonacci
```
