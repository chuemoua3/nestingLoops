In programming, the term "nested" usually means to put something inside the same thing. "Nested loops" would be two loops with one inside the other one. If you do it right, then means the inner loop will repeat all its iterations every time the outer loop does one more iteration.

Start by downloading the following code, and get it to compile.

public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( char c='A'; c <= 'E'; c++ )
        {
            for ( int n=1; n <= 3; n++ )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
        }

        System.out.println("\n");

    }
}


What You Should See
A 1
A 2
A 3
B 1
B 2
B 3
C 1
C 2
C 3
D 1
D 2
D 3
E 1
E 2
A 3


1-1 1-2 1-3 2-1 2-2 2-3 3-1 3-2 3-3



What You Should Do on Your Own
Assignments turned in without these things will receive no credit.

1.  Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.
2.  Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
3.  Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)
4.  Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?