A group of people, including Deeksha, attended an exhibition. Deeksha, the organizer, is concerned about the 
safety of the attendees. To address this concern, she needs a program that can identify the two individuals in 
the group with the highest and lowest ages.

Write a program that will assist Deeksha in ensuring the well-being of the exhibition's participants.(Observe the
 Sample Test Case)

Sample Test Case:

Enter the number of people: 5
Enter the age of each person:
55 69 52 20 10
Maximum age: 69
Minimum age: 10
Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·number·of·people:·5
Enter·the·age·of·each·person:
55 69 52 20 10
Maximum·age:·69
Minimum·age:·10

Test Case 2:
Expected Output:
Enter·the·number·of·people:·6
Enter·the·age·of·each·person:
22 23 63 10 55 44
Maximum·age:·63
Minimum·age:·10

Test Case 3:
Expected Output:
Enter·the·number·of·people:·2
Enter·the·age·of·each·person:
56 45
Maximum·age:·56
Minimum·age:·45

Test Case 4:
Expected Output:
Enter·the·number·of·people:·6
Enter·the·age·of·each·person:
2 54 66 33 44 41
Maximum·age:·66
Minimum·age:·2



package q1147;
import java.util.Scanner;
public class FindMinAndMax {
    public static void main(String[] args) {
        //write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int x = in.nextInt();
        int a[] = new int[x];
        System.out.println("Enter the age of each person:");
        for (int i =0;i<x;i++)
        {
        	a[i]=in.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int j = 0;j<x;j++)
        {
        	if (a[j]>max)
        	{
        		max=a[j];
        	}
        	if (a[j]<min)
        	{
        		min=a[j];
        	}
        }
        System.out.println("Maximum age: "+max);
        System.out.println("Minimum age: "+min);
    }
}