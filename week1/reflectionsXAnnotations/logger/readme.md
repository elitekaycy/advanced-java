# LogExecutionTime Annotation and Handler

## Overview

In this project, I've implemented a custom LogExecutionTime annotation in Java to log the execution time of methods. Alongside the annotation, I've developed a handler using reflection and the proxy pattern. This handler intercepts method calls annotated with @LogExecutionTime, measuring their execution duration. This approach showcases how reflection can be leveraged to enhance method logging dynamically, demonstrating practical use cases for annotations in Java applications.

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
java -cp out out.week1.reflectionsXAnnotations.logger.LogExecutionTimeTestMain
```
