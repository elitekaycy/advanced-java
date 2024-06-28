# NIO Write File using FileChannel

## Overview

In this Java program, I demonstrate efficient file writing using Java NIO (Non-Blocking IO). The NioWrite class utilizes `FileChannel` and `ByteBuffer` to perform low-level file writing operations, ensuring optimal performance and efficient handling of byte data.

### Components

- **NioWrite**: The main class that implements file writing functionality using Java NIO.
  - **writeToNioFile(String data)**: Writes the provided `data` string to the file `open.txt`.
  - **main(String[] args)**: Entry point of the program that invokes the `writeToNioFile` method with a sample data string.

### Usage

### 1. Run the Code

Compile the Java files using the following command in your current directory:

```bash
java NioWrite.java
```
