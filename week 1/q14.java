Raju is a farmer. He wants to take a loan from a bank that offers a low Simple Interest Rate on a certain amount 
of capital. Raju needs help in calculating S.I with the given parameters p,r,t (prime, rate, time).
Write a java program based on above scenario to help Raju.

Sample Test Case:

Enter the principal amount: 850000.56
Enter the rate of interest (in percentage): 3.5
Enter the time (in years): 2.3
Simple Interest: 68425.04508

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·principal·amount:·10000
Enter·the·rate·of·interest·(in·percentage):·3
Enter·the·time·(in·years):·2
Simple·Interest:·600.0

Test Case 2:

Expected Output:
Enter·the·principal·amount:·5000.658
Enter·the·rate·of·interest·(in·percentage):·5
Enter·the·time·(in·years):·5
Simple·Interest:·1250.1645

Test Case 3:

Expected Output:
Enter·the·principal·amount:·560000
Enter·the·rate·of·interest·(in·percentage):·3
Enter·the·time·(in·years):·2
Simple·Interest:·33600.0

Test Case 4:

Expected Output:
Enter·the·principal·amount:·850000.56
Enter·the·rate·of·interest·(in·percentage):·3.5
Enter·the·time·(in·years):·2.3
Simple·Interest:·68425.04508

package q1169;
import java.util.Scanner;
public class SimpleInterestCalculator { public static void main(String[] args) {
//write your code here
Scanner a = new Scanner(System.in);
System.out.print("Enter the principal amount: ");
Double x =a.nextDouble();
System.out.print("Enter the rate of interest (in percentage): ");
Double y =a.nextDouble();
System.out.print("Enter the time (in years): ");
Double z =a.nextDouble();
System.out.println("Simple Interest: "+(x*y*z)/100);