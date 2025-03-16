package org.example;

/**
 * Teacher class to represent a teacher
 */
public class Teacher {
    // TODO: Add instance variables
    String firstName;
    String lastName;
    String subject;

    // TODO: Implement correct code for getters/setters
    /**
     * Get the first name of the teacher
     *
     * @return first name of the teacher
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name of the teacher
     *
     * @param firstName first name of the teacher
     */
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    /**
     * Get the last name of the teacher
     *
     * @return last name of the teacher
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the teacher
     *
     * @param lastName last name of the teacher
     */
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    /**
     * Get the subject taught by the teacher
     *
     * @return subject taught by the teacher
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Set the subject taught by the teacher
     *
     * @param subject subject taught by the teacher
     */
    public void setSubject(String subject) {
        this.subject=subject;
    }

    /**
     * Constructor to create a new teacher
     *
     * @param firstName first name of the teacher
     * @param lastName last name of the teacher
     * @param subject subject taught by the teacher
     */
    public Teacher(String firstName, String lastName, String subject) {
        // TODO: Set instance variables
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
    }

    /**
     * Return a string representation of the teacher
     *
     * @return string representation of the teacher
     */
    public String toString() {
        // TODO: Return a string representation of the teacher in this format:
        // firstName lastName (subject)
        return firstName + " " + lastName + " (" + subject + ")";
    }
}
