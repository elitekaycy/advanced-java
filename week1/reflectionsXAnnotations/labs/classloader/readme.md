# Custom Class Loader with Annotation Reflection

## Overview

This project demonstrates a custom Java class loader capable of dynamically loading classes annotated with @Loadable. Using reflection, it allows invocation of annotated methods at runtime. Key components include CustomClassLoader for loading from directories, CustomClassLoaderTestMain for demonstration, Loadable Annotation for marking dynamic classes, and LoadableClass examples.

### Components

- **CustomClassLoader**: Extends `ClassLoader` to load classes from specified directories or resources.
- **CustomClassLoaderTestMain**: Main entry point demonstrating the usage of the custom class loader.
- **Loadable Annotation**: Marks classes and methods eligible for dynamic loading and invocation.
- **LoadableClass**: Example classes containing methods annotated with `@Loadable`.

## Usage

### 1. Compile the Code

Compile the Java files using the following command in your current directory:

```bash
javac -d out *.java
```

### 2. run the code

run the Java files using the following command in your current directory:

```
java -cp out week1.reflectionsXAnnotations.classloader.CustomClassLoaderTestMain
```
