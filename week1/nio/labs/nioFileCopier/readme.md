# NIO File Copier

## Overview

In this Java program, I demonstrate efficient file copying using Java NIO (Non-Blocking IO). The NioFileCopier class utilizes `FileChannel` and `ByteBuffer` for performing low-level file operations, ensuring optimal performance during file copying tasks.

### Components

- **NioFileCopier**: The main class that implements file copying functionality using Java NIO.
  - **copyFile(String from, String to)**: Copies a file specified by `from` to the location `to`.
  - **main(String[] args)**: Entry point of the program that initiates the file copying process.

### Usage

### 1. Run the Code

Compile the Java files using the following command in your current directory:

```bash
java NioFileCopier.java
```
