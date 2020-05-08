/*Date: 5/8/2020
Nesting Loops Assignment
In programming, the term "nested" usually means to put something inside the same thing. "Nested loops" would be two loops with one inside the 
other one. If you do it right, then means the inner loop will repeat all its iterations every time the outer loop does one more iteration.

What You Should Do on Your Own
Assignments turned in without these things will receive no credit.

1. Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.

2. Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?

3. Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)

4. Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?

*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class NestingLoops {
    public static void main(String[] args) {

        // This is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(n + " " + c);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}

/*Answers to the questions above
1.  The variable n changes faster
2.  The output changes by c being faster
3.  It outputs each values on a new line instead of all one line
4.  It outputs to a new line after there is an every third output


*/