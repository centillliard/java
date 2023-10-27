# Guide: Listing Java Cryptographic Algorithms

For DevOps engineers working with Java applications, it is often crucial to know what cryptographic algorithms are available on your system, especially when configuring security settings. Below is a guide on how to obtain and run a Java program to list all cryptographic algorithms available in the Java Virtual Machine (JVM).

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- Basic knowledge of running commands in the terminal.
- Git (if you choose to clone the repository).

## Step 1: Obtain the Java Program

You have two options to obtain the `ListCryptoAlgorithms.java` file:

### Option 1: Clone the Repository

Clone the repository and navigate to the appropriate directory:

```sh
git clone https://github.com/centillliard/java.git
cd java/crypto-algorithms
```

### Option 2: Create the File Manually

If you prefer not to clone the entire repository, you can create the Java file manually:

1. Create a new file named `ListCryptoAlgorithms.java`.
2. Copy the content from the [ListCryptoAlgorithms.java file](https://github.com/centillliard/java/blob/main/crypto-algorithms/ListCryptoAlgorithms.java) on GitHub.
3. Paste the content into your local `ListCryptoAlgorithms.java` file.

**Note:** Ensure that the filename matches the class name inside the file, which in this case is `ListCryptoAlgorithms`.

## Step 2: Compile the Java Program

Open a terminal and navigate to the directory containing the `ListCryptoAlgorithms.java` file. Run the following command:

```sh
javac ListCryptoAlgorithms.java
```

This command compiles the Java program and generates a `ListCryptoAlgorithms.class` file.

## Step 3: Run the Java Program

After compilation, run the program using the following command:

```sh
java ListCryptoAlgorithms
```

The output will list all the cryptographic algorithms available in your JVM, grouped by the security provider.

## Step 4: Interpret the Output

- The output will be quite verbose. Each provider will have a list of algorithms associated with it.
- You can redirect the output to a file or use `grep` to filter through the results if you are looking for a specific algorithm.

## Example Usage

```sh
java ListCryptoAlgorithms | grep RSA
```

This example will filter the output to show only lines containing "RSA".