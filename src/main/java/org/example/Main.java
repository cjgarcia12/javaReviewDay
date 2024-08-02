package org.example;

// I will be putting all the methods from coding bat in this main. I apologize to anyone looking at this...
public class Main {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        //this is the only instance of false so all other should be true
        return !weekday || vacation;
    }

    // Same deal. I used a or statement to keep in just in one return
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (!aSmile || bSmile) && (aSmile || !bSmile);
    }


    public int sumDouble(int a, int b) {
        // to ensure that a does not equal b
        if (a != b) {
            return a + b;
        }
        // if it does we do this instead
        else {
            return (a + b) * 2; // used parentheses to make sure the calculations were right
        }
    }

    // same logic as the last one except we check to see if `n` is less than 21
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    // With the goal of trying to keep everything in one if else block, had to do an odd approach
    public boolean parrotTrouble(boolean talking, int hour) {
        // check if talking is true and the time (hour) is less than 7 or greater than 20
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    // to return a string that repeats a given string n amount of times
    public String stringTimes(String str, int n) {
        // initialize result
        String result = "";

        // using a for loop to append the given str to out result
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    // to return a string that takes only the first three characters (front) and appends it to the result n times
    public String frontTimes(String str, int n) {
        // setting front to a string at the top of the scope
        String front;

        // check if the string has three characters
        if (str.length() >= 3) {
            // setting front equal to the first three char
            front = str.substring(0, 3);
        } else {
            // if not we just use whatever is there
            front = str;
        }

        // initializing result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            //appending front to result
            result.append(front);
        }
        return result.toString();
    }

    // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    public int countXX(String str) {
        // set of count of XX to keep track of
        int countOfXX = 0;

        // use a for loop to check each character. We can assume no misplaced XX (ex. AxAx should not be in the string)
        for (int i = 0; i < str.length(); i++) {
            // check if we are at the last char to avoid errors
            if (i == str.length() - 1) {
                break;
            } else {
                // check for overlapping by checking the next character
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    countOfXX++;
                }
            }
        }
        return countOfXX;
    }

    // Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    public boolean doubleX(String str) {
        // similar logic to the last one except we are just checking if there is a repeating x like (xx)
        for (int i = 0; i < str.length(); i++) {
            // check to see if we are at the last char to avoid out of bounds exceptions
            if (i == str.length() - 1) {
                break;
            } else {
                // check if the char and the char next to it is == x
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    return true;
                }
                // acounting for first instances
                else if (str.charAt(i) == 'x') {
                    return false;
                }
            }
        }
        return false;
    }

    // Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        // init result to an empty string
        StringBuilder result = new StringBuilder();

        // we use a for loop so that we can acount for all lengths
        for (int i = 0; i < str.length(); i++) {
            // to only get every other letter
            if (i % 2 == 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    //Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {
        // init result as an empty string
        String result = "";

        // using a for loop to print out the characters increasing the distance each time
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i+1);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}