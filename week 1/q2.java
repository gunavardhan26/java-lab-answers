A contractor need to build a house for which he has to buy Y number of bricks of price X each.Help him to 
display total amount required to buy Y number of bricks.
Write a java program based on above Scenario.
Assumptions:
	Price X may be integer or double datatype
	Price Y may be integer or double datatype
	Total amount should be in double datatype
Sample Test Case:

Enter price: 10.56
Enter quantity: 50.5
Total amount: 533.28

Sample Test Cases

Test Case 1:

Expected Output:
Enter·price:·100
Enter·quantity:·20
Total·amount:·2000.0

Test Case 2:

Expected Output:
Enter·price:·10.56
Enter·quantity:·50.5
Total·amount:·533.28

Test Case 3:

Expected Output:
Enter·price:·87.5
Enter·quantity:·65
Total·amount:·5687.5

Test Case 4:

Expected Output:
Enter·price:·83.56
Enter·quantity:·200.3
Total·amount:·16737.068000000003

package q1149;
import java.util.Scanner;
public class doubleExample { public static void main(String[] args) { 
//write your code here
Scanner a = new Scanner(System.in);
System.out.println("Enter price: ");
System.out.print("Enter quantity: ");
double x = a.nextDouble();
double y = a.nextDouble();
System.out.println("Total amount: "+(x*y));
}
}