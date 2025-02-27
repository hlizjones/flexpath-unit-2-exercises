package org.example;


public class Exercises {
    // EXAMPLE EXERCISE:
    //
    // Make an integer variable called x and set it to 2
    // Make an integer variable called y and set it to 2
    // Add x and y together and store the result in a variable called result
    // Return the result
    public int addTwoPlusTwo() {
        int x = 2;
        int y = 2;
        int result = x + y;

        // Always end the exercise method with a return statement returning the result
        // (We will learn more about return statements later)
        return result;
    }

    // EXERCISE 1:
    //
    // Make a variable called pi and set it to 3.14
    // Multiply pi by 5 and store the result in a variable called result
    // Return the result
    public double multiplyPiBy5() {
        double pi = 3.14;
        double result = 5 * pi;
        return result;
    }

    // EXERCISE 2:
    //
    // Make a variable called name and set it to "Alice"
    // Make a variable called age and set it to 25
    // Concatenate name and age together and store the result in a variable called result
    // Return the result
    public String concatenateNameAndAge() {
        String name = "Alice";
        int age = 25;
        String result = name + age;
        return result;
    }

    // EXERCISE 3:
    //
    // Make a variable called result and set it to an empty string ("")
    // Make a variable called prompt and set it to "Do you want to continue?"
    // Make a variable called userInput and set it to "Yes"
    // If userInput is equal to "Yes", store "The program will continue" into the result variable
    // Otherwise, store "The program will end" into the result variable
    // Return the result
    public String continueOrEnd() {
        String result = "";
        String prompt = "Do you want to continue?";
        String userInput = "Yes";
        if (userInput.equals("Yes"))
            result = "The program will continue";
        else result = "The program will end";
        return result; // REMOVE THIS LINE
    }

    // EXERCISE 4:
    //
    // Make an array called results and set it to {0, 0, 0}
    // Write a for loop that goes from 0 to the length of the results array, storing the current index in i
    // In the loop body, set results[i] to i
    // Return results
    public int[] storeIndexInArray() {
        int[] results = { 0, 0, 0 };
        for (int i = 0; i < results.length; i++)
            results[i] = i;
        return results;
    }

    // EXERCISE 5:
    //
    // Make a String variable called prompt and set it to "What is our favorite language?"
    // Make a String variable called correctAnswer and set it to "Java"
    // Make a String array called studentAnswers and set it to {"Python", "Java", "C++"}
    // Make an int variable called result and set it to 0
    // Write a loop that goes through each element in studentAnswers
    // If the current element is equal to correctAnswer, add 1 to result
    // Return result
    public int countCorrect() {
        String prompt = "What is our favorite language?";
        String correctAnswer = "Java";
        String[] studentAnswers = {"Python", "Java", "C++"};
        int result = 0;
        for ( String current : studentAnswers) {
            if (current.equals(correctAnswer))
                result++;
        }
        return result;
    }

    // EXERCISE 6:
    //
    // Complete this method to make it return the product of the two passed in parameters
    public int multiply(int x, int y) {
        int result = x * y;
        return result; // REMOVE THIS LINE
    }

    // EXERCISE 7:
    //
    // Complete this method to make it return the sum of all of the elements in the passed in array
    // For example, if the passed in array is {1, 2, 3}, the method should return 6
    public int sumArray(int[] arr) {
        int result = 0;
        for (int el : arr) {
            result += el;
        }
        return result; // REMOVE THIS LINE
    }
}
