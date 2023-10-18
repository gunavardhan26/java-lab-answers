Sarah is learning about the Fibonacci sequence in her maths class. Her teacher asked to start the sequence with 
two initial values, which are 0 & 1. Sarah is fascinated by this sequence and wants to explore it further.
Write a java program that generates the first n numbers in the Fibonacci sequence in Recursive(with using recursion) and Non-recursive way(without using recursion), starting with the initial values of 0 and 1, and then 
prints them out.

Sample Test Case:

Enter the range: 10
Fibonacci Sequence (Recursive):
0 1 1 2 3 5 8 13 21 34 
Fibonacci Sequence (Non-Recursive):
0 1 1 2 3 5 8 13 21 34 

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·range:·5
Fibonacci·Sequence·(Recursive):
0·1·1·2·3·
Fibonacci·Sequence·(Non-Recursive):
0·1·1·2·3·

Test Case 2:

Expected Output:
Enter·the·range:·10
Fibonacci·Sequence·(Recursive):
0·1·1·2·3·5·8·13·21·34·
Fibonacci·Sequence·(Non-Recursive):
0·1·1·2·3·5·8·13·21·34·

Test Case 3:

Expected Output:
Enter·the·range:·4
Fibonacci·Sequence·(Recursive):
0·1·1·2·
Fibonacci·Sequence·(Non-Recursive):
0·1·1·2·

Test Case 4:

Expected Output:
Enter·the·range:·9
Fibonacci·Sequence·(Recursive):
0·1·1·2·3·5·8·13·21·
Fibonacci·Sequence·(Non-Recursive):
0·1·1·2·3·5·8·13·21·

package q1172;
import java.util.Scanner; public class Fibonacci {
// Recursive function to calculate Fibonacci number
public static int fibonacciRecursive(int n) { 
//write code with using recursion
if (n<=1)
{
return n;
}
return fibonacciRecursive (n-1)+fibonacciRecursive(n-2);
Non-recursive (iterative) function to calculate Fibonacci number 
public static int fibonacciIterative (int n) { 
//write code without using recursion
int f[]=new int[n+2];
int i;
f[0]=0;
f[1]=1;
for (i=2;i<=n;i++)
{ 
f[i]-f[i-1]+f[i-2];
} 
return f[n];
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the range: ");
int n = scanner.nextInt();
System.out.println("Fibonacci Sequence (Recursive):"); 
for (int i = 0; i < n; i++) {
System.out.print(fibonacciRecursive(i) + " ");
} System.out.println("\nFibonacci Sequence (Non-Recursive):"); 
for (int i = 0; i < n; i++) {
System.out.print(fibonacciIterative(i) +" ");
} 
System.out.println();
}
}