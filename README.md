# Java Program to Add Thousands Separator to Integer

This Java program includes a method `addThousandsSeparator` in the `Main` class, which adds a thousands separator (') to a given integer. For example, the integer 2738777 is converted to the string "2'738'777".

## Method Description

### `addThousandsSeparator`

The method `addThousandsSeparator` takes a long integer and returns a string representation of the integer with thousands separators added. It follows these steps:

1. Converts the integer to a string.
2. Iterates over the string from right to left.
3. Appends each digit to a StringBuilder.
4. Adds a single quote (`'`) after every third digit, except at the beginning of the number.

Example:
- Input: `738777`
  - Output: `738'777`

## Running the Program

To run the program and test the `addThousandsSeparator` method, follow these steps:

1. Ensure you have Java installed on your machine.
2. Use any Java IDE (like IntelliJ IDEA, Eclipse, or command-line tools).
3. Clone the repository or copy the `Main.java` file into your project.
4. Compile and run the `Main` class.

### Running Tests

The provided `main` method includes test cases to verify the correctness of the `addThousandsSeparator` method. To run the tests:

1. Execute the `main` method in your IDE or compile and run the program.
2. The tests will check if the method correctly formats integers with thousands separators.

If all tests pass successfully, you will see the message "All tests passed. Congratz !" indicating that the method works correctly for the provided test cases.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
