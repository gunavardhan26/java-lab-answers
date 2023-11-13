Suresh is an employee at a medical store, and he stores delicate and expensive medicines in a wooden box. This 
box is divided into numRows rows and numCols columns.Each medicine inside the box has a label indicating 
its price.

You are asked to create a program that calculates and displays the total price of all the medicines stored in this 
box.



Sample Test Case:

Enter the number of rows: 3
Enter the number of columns: 3
Enter the prices of each medicine:
856 698 547
693 574 693
569 658 547
Total amount: 5835
Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·number·of·rows:·3
Enter·the·number·of·columns:·3
Enter·the·prices·of·each·medicine:
856 698 547
693 574 693
569 658 547
Total·amount:·5835

Test Case 2:
Expected Output:
Enter·the·number·of·rows:·3
Enter·the·number·of·columns:·2
Enter·the·prices·of·each·medicine:
254 695
458 632
555 852
Total·amount:·3446

Test Case 3:
Expected Output:
Enter·the·number·of·rows:·3
Enter·the·number·of·columns:·1
Enter·the·prices·of·each·medicine:
455
855
966
Total·amount:·2276

Test Case 4:
Expected Output:
Enter·the·number·of·rows:·2
Enter·the·number·of·columns:·3
Enter·the·prices·of·each·medicine:
198 698 777
999 387 888
Total·amount:·3947


package q1163;
import java.util.Scanner;
public class SumOf2DArray {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int numRows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int numCols=scanner.nextInt();
		int[][] matrix = new int[numRows][numCols];
		System.out.println("Enter the prices of each medicine:");
		for (int i = 0;i<numRows;i++)
		{
			for (int j = 0;j<numCols;j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
        int sum=0;
        //write your code here
        for (int k = 0;k<numRows;k++)
        {
        	for (int l = 0;l<numCols;l++)
        	{
        		sum = sum+matrix[k][l];
        	}
        }
        System.out.println("Total amount: "+sum);
       
       
        
    }
}
