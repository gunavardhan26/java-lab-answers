A student named Akash wants to find sum and product of two numbers. Every time Akash has to perform 
those tasks for different numbers.
Write a java program to help Akash which takes two numbers and prints sum and product of the given 
numbers.

Sample Test Case:

Enter the num1 value: 10
Enter the num2 value: 20
Sum of 10 and 20 = 30
Product of 10 and 20 = 200

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·num1·value:·10
Enter·the·num2·value:·20
Sum·of·10·and·20·=·30
Product·of·10·and·20·=·200

Test Case 2:

Expected Output:
Enter·the·num1·value:·58
Enter·the·num2·value:·69
Sum·of·58·and·69·=·127
Product·of·58·and·69·=·4002

Test Case 3:

Expected Output:
Enter·the·num1·value:·875
Enter·the·num2·value:·258
Sum·of·875·and·258·=·1133
Product·of·875·and·258·=·225750

Test Case 4:

Expected Output:
Enter·the·num1·value:·235
Enter·the·num2·value:·548
Sum·of·235·and·548·=·783
Product·of·235·and·548·=·128780

package q1144;
import java.util.Scanner;
public class SumAndProductOfInt
{
public static void main (String[] args)
{
Scanner a = new Scanner(System.in);
System.out.println("Enter the numl value: ");
System.out.print("Enter the num2 value: ");
int x = a.nextInt();
int y = a.nextInt();
System.out.println("Sum of "+x+" and "+y+" "+(x+y));
System.out.println("Product of and "+(x*y));
}
