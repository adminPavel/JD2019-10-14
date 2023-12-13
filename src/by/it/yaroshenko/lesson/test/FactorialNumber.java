package by.it.yaroshenko.lesson.test;

// Java Program to implement
// Factorial using recursion
class GFG {

    // recursive method
    int fact(int n)
    {
        int result;

        if (n == 1) { return 1; }
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}

// Driver Class
class Recursion {

    // Main function
    public static void main(String[] args)
    {
        GFG f = new GFG();

       // System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 3 is "
                + f.fact(3));
       // System.out.println("Factorial of 2 is " + f.fact(2));
    }
}

