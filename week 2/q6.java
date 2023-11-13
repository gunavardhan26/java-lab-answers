Write a Java Program that prompts the user for an integer and then prints out all the prime numbers up to that 
Integer.

Sample Test Case:

Enter the end of the range: 10
2 3 5 7 
Sample Test Cases

Test Case 1:
Expected Output:
Enter·the·end·of·the·range:·10
2·3·5·7·

Test Case 2:
Expected Output:
Enter·the·end·of·the·range:·20
2·3·5·7·11·13·17·19·

Test Case 3:
Expected Output:
Enter·the·end·of·the·range:·100
2·3·5·7·11·13·17·19·23·29·31·37·41·43·47·53·59·61·67·71·73·79·83·89·97·

Test Case 4:
Expected Output:
Enter·the·end·of·the·range:·30
2·3·5·7·11·13·17·19·23·29·


package q1167;
import java.util.Scanner;
public class PrimeNumber {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter the end of the range: ");
          // write your logic here
          int a = input.nextInt();
          for (int i = 2;i<=a;i++)
          {
             int c =1;
            for (int j = 2;j<=i/2;j++)
            {
                    if (i%j==0)
                    {
                            c =0;
                              break;                    
                    }
            }
            if (c==1){
                    System.out.print(i+" ");
             }
            }
	}
}