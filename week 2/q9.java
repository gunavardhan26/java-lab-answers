Write a Program to remove an Element from given Array



Problem Statement:

The function should return the array excluding the given element


Function Rules:

Fill the missing logic in function RemoveElementFromArray with return type int[] and parameters as listed 
below:

int[] arr
int element


Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·size·of·the·array:·5
Enter·the·elements·of·the·array:
2 3 4 5 6
Enter·the·element·to·remove:·5
Array·after·removing·5:
2·3·4·6·

Test Case 2:
Expected Output:
Enter·the·size·of·the·array:·6
Enter·the·elements·of·the·array:
3 4 5 6 7 77
Enter·the·element·to·remove:·1
Array·after·removing·1:
3·4·5·6·7·77·

Test Case 3:
Expected Output:
Enter·the·size·of·the·array:·10
Enter·the·elements·of·the·array:
1 2 3 4 5 6 7 8 9 11
Enter·the·element·to·remove:·9
Array·after·removing·9:
1·2·3·4·5·6·7·8·11·

Test Case 4:
Expected Output:
Enter·the·size·of·the·array:·4
Enter·the·elements·of·the·array:
5 6 89 63
Enter·the·element·to·remove:·5
Array·after·removing·5:
6·89·63·


package q1145;
import java.util.ArrayList;
//package q1145;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
 public static int[] removeElement(int[] arr, int element) {
 	//write you code here
 	int s = 0;
 	for (int i: arr)
 	{
 		if (i!=element){
 			s++;
 		}
 	}
 	int k=0;
 	int [] f = new int[s];
 	for (int j =0;j<arr.length;j++)
 	{
 		if (arr[j]!=element)
 		{
 			f[k]=arr[j];
 			k++;
 		}
 	}
 	return f;
// 	for (int d =0;d<size-1)

 }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to be removed
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Call the removeElement method to remove the element
        int[] modifiedArray = removeElement(arr, elementToRemove);

        // Display the modified array
        System.out.println("Array after removing " + elementToRemove + ":");
        for (int i = 0; i < modifiedArray.length; i++) {
        System.out.println();
    }
}