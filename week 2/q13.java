Problem Statement:

The computer vision researchers are developing an advanced image enhancement algorithm for medical X-ray 
images. To achieve this, they need to transpose the pixel matrices of these X-ray images, which are stored in a 
database. Your task is to create a program that can efficiently transpose a given two-dimensional matrix, 
helping the researchers in their image enhancement process.



Sample Test Case:

Enter the number of rows: 3
Enter the number of columns: 2
Enter the elements of the matrix:
2 4
5 4
8 7
Transpose of the Matrix:
2 5 8 
4 4 7 
Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·number·of·rows:·3
Enter·the·number·of·columns:·3
Enter·the·elements·of·the·matrix:
5 6 8
5 7 9
3 6 8
Transpose·of·the·Matrix:
5·5·3·
6·7·6·
8·9·8·

Test Case 2:
Expected Output:
Enter·the·number·of·rows:·4
Enter·the·number·of·columns:·4
Enter·the·elements·of·the·matrix:
5 6 9 8
6 3 9 8
5 7 2 1
4 4 2 7
Transpose·of·the·Matrix:
5·6·5·4·
6·3·7·4·
9·9·2·2·
8·8·1·7·

Test Case 3:
Expected Output:
Enter·the·number·of·rows:·2
Enter·the·number·of·columns:·2
Enter·the·elements·of·the·matrix:
2 1
5 4
Transpose·of·the·Matrix:
2·5·
1·4·

Test Case 4:
Expected Output:
Enter·the·number·of·rows:·3
Enter·the·number·of·columns:·2
Enter·the·elements·of·the·matrix:
2 4
5 4
8 7
Transpose·of·the·Matrix:
2·5·8·
4·4·7·



package q1164;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //write your code here
        System.out.println("Transpose of the Matrix:");
        for (int i =0;i<numCols;i++)
        {
        	for (int j=0;j<numRows;j++)
        	{
        		System.out.print(matrix[j][i]+" ");
        	}
        
        System.out.println();
        }
    }
}