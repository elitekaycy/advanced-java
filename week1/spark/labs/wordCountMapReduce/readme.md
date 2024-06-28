# Word Count MapReduce

## Overview

This project showcases my implementation of a simple MapReduce framework in Java aimed at counting word frequencies in a text file. I've designed methods to read the file line by line, map words to their respective counts, and reduce the intermediate results to produce the final word counts.

### Components

- **WordCountMapReduce**: The main class containing methods for reading the file, mapping words to counts, and reducing the counts.
  - **stream()**: Reads a file line by line and returns an array of lines.
  - **mapper(String line)**: Maps a single line of text to a map of word counts.
  - **mapper(String[] lines)**: Maps an array of lines to a list of word count maps.
  - **reduce()**: Reduces a list of word count maps to a single word count map.
- **sample.txt**: A sample text file containing lines of text for testing the word count implementation.

## Usage

### 1. Run the Code

Run the Java file using the following command in your current directory:

```bash
java WordCountMapReduce.java
```
