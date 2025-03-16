package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends  Exception {
    /**
     * The numerator of the failed division operation.
     */
    private double a;

    /**
     * The denominator of the failed division operation.
     */
    private double b;

    /**
     * Get the numerator of the failed division operation.
     *
     * @return The numerator of the failed division operation.
     */
    public double getA() {
        return a;
    }

    /**
     * Get the denominator of the failed division operation.
     *
     * @return The denominator of the failed division operation.
     */
    public double getB() {
        return b;
    }

    /**
     * Constructor for the CustomDivideByZeroException.
     */
    public CustomDivideByZeroException(double a, double b) {
        // TODO: Modify this constructor to accept and store the two values attempted to be divided
        super("Attempted to divide " + a + " by " + b);
        this.a = a;
        this.b = b;
    }
}
