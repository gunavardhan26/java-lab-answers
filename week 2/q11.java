Write a java program to print Leaders from the given array



Explaination:



In the context of an array, "leaders" are elements that are greater than all the elements to their right in the
 array. In other words, a leader is an element that does not have any element to its right that is greater than
 itself. Leaders "stand out" in the sense that they are the largest elements towards the right end of the array.



Here's an example to illustrate the concept of leaders in an array:



Suppose you have an array:



arr = [16, 17, 4, 3, 5, 2]



In this example, the leaders in the array are 17, 5, and 2.



The task of finding leaders in an array involves iterating through the array from right to left and identifying 
elements that are greater than or equal to the maximum element seen so far to their right. If an element meets
this condition, it is considered a leader and can be printed.

Print the leaders in the reverse order(right to left) of the array.

Sample Test Case:

Enter the number of elements in the array: 5
Enter the elements of the array:
78 85 6 45 55
Leaders in the array:
55 85 
Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·number·of·elements·in·the·array:·5
Enter·the·elements·of·the·array:
78 85 6 45 55
Leaders·in·the·array:
55·85·

Test Case 2:
Expected Output:
Enter·the·number·of·elements·in·the·array:·6
Enter·the·elements·of·the·array:
85 69 54 71 6 5
Leaders·in·the·array:
5·6·71·85·

Test Case 3:
Expected Output:
Enter·the·number·of·elements·in·the·array:·3
Enter·the·elements·of·the·array:
2 8 6
Leaders·in·the·array:
6·8·

Test Case 4:
Expected Output:
Enter·the·number·of·elements·in·the·array:·4
Enter·the·elements·of·the·array:
-54 -8 -75 -7
Leaders·in·the·array:
-7·


package q1160;
import java.util.Scanner;

public class LeadersInArray {
	public static void findLeaders(int[] arr) {
	//write your code here	
	int a = arr.length;
	int b = arr[a-1];
	System.out.println("Leaders in the array:");
	for (int i=a-1; i>=0;i--)
	{
		if (arr[i]>=b){
			b=arr[i];
			System.out.print(b+" ");
		}
	}
	System.out.println();
		
		
		
		
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findLeaders(arr);
    }
}