# LogExecutionTime Annotation and Handler

## Overview

This project demonstrates a simple implementation of a custom `LogExecutionTime` annotation in Java, along with a corresponding handler to log the execution time of methods annotated with `@LogExecutionTime`. The approach uses reflection and the proxy pattern to intercept method calls and measure their execution duration.

### Components

- **LogExecutionTime Annotation**: Marks methods for which execution time needs to be logged.
- **LogExecutionTimeHandler**: Handles the logic to intercept method calls and measure their execution time.
- **ProxyFactory**: Generates dynamic proxies to wrap annotated methods and apply the `LogExecutionTimeHandler`.

## Usage

### 1. Compile the Code

Compile the Java files using the following command in your current directory:

```bash
javac -d out *.java
```

### 2. run the Code

Compile the Java files using the following command in your current directory:

```bash
javac -d out *.java
```
