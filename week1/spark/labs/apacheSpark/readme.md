# Overview

This project demonstrates a simple Apache Spark application in Java for counting word frequencies in a text file. The implementation uses Spark's Java API to read text data, map words to their respective counts, and reduce the results to compute the final word frequencies.

## Components

- **App.java**: Main class containing the Spark job implementation.
  - **main(String[] args)**: Entry point of the application.
  - **SparkConf conf**: Configures the Spark application.
  - **JavaSparkContext sc**: Initializes the Spark context.
  - **JavaRDD<String> lines**: Reads text data from a file.
  - **JavaRDD<String> words**: Splits lines into words.
  - **JavaPairRDD<String, Integer> ones**: Maps each word to a count of 1.
  - **JavaPairRDD<String, Integer> counts**: Reduces word counts.
  - **Map<String, Integer> wordCounts**: Collects and prints final word counts.
- **src/main/resources/content1.txt**: Sample text file used for word counting.

[see more](./sparks/readme.md)
