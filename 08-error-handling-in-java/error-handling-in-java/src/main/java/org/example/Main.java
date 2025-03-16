package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {
    /**
     * Divide two numbers safely.  If the result is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivision(double a, double b) {
        // todo: Handle the unchecked ArithmeticException by returning 0.
        if (b == 0)
            return 0;
        return a/b;
    }

    /**
     * Get the second letter of a string.
     *
     * @param s String to get the second letter from
     * @param logMessages List of log messages to add to
     * @return The second letter of the string
     */
    public static String getSecondLetter(String s, List<String> logMessages) {
        // TODO: Handle the StringIndexOutOfBoundsException by returning an empty string ("")
        try {
            return s.substring(1, 2);
        } catch (StringIndexOutOfBoundsException ex) {
            return ("");
        }

        // TODO: This line needs to happen after the try/catch block, regardless of whether an exception is thrown (use a finally block)
        finally { logMessages.add("Exiting method"); }
    }

    /**
     * Read a fake file and return its contents.
     *
     * @param logMessages List of log messages to add to
     * @return The contents of the faked file
     */
    public static String readFile(List<String> logMessages) {
        // TODO: Initialize the FakeFileReader in a try-with-resources block to make sure it closes and updates the logMessages list
        try (FakeFileReader reader = new FakeFileReader(logMessages)) {
            return reader.read();
        }
    }

    /**
     * Safely divide two numbers.  If the denominator is zero, it will return 0.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of the division
     */
    public static double safeDivideWithCustomException(double a, double b) throws CustomDivideByZeroException {
        // TODO: handle divide by zero by throwing a CustomDivideByZeroException
        // TODO: Modify the custom exception to pass a,b to the constructor and store them in the exception (see CustomDivideByZeroException.java)
        if (b == 0)
            throw new CustomDivideByZeroException(a, b);
        return a / b;
        }
}
