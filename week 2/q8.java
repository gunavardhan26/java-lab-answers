Rani needs to create a Java program that operates a printing machine to produce a pyramid-shaped pattern
using alphabetic characters. This program should take a parameter 'n' to determine the number of rows in the 
pyramid and then navigate the printing machine accordingly to achieve the desired pyramid pattern.

Sample Test Case:

4
    A 
   A B 
  A B C 
 A B C D

Sample Test Cases
Test Case 1:
Expected Output:
4
····A·
···A·B·
··A·B·C·
·A·B·C·D·
Test Case 2:
Expected Output:
3
···A·
··A·B·
·A·B·C·
Test Case 3:
Expected Output:
10
··········A·
·········A·B·
········A·B·C·
·······A·B·C·D·
······A·B·C·D·E·
·····A·B·C·D·E·F·
····A·B·C·D·E·F·G·
···A·B·C·D·E·F·G·H·
··A·B·C·D·E·F·G·H·I·
·A·B·C·D·E·F·G·H·I·J·
Test Case 4:
Expected Output:
7
·······A·
······A·B·
·····A·B·C·
····A·B·C·D·
···A·B·C·D·E·
··A·B·C·D·E·F·
·A·B·C·D·E·F·G·




package q1171;
import java.util.Scanner;
public class AlphabetPyramid
{
        public static void main(String[] args)
        {
               Scanner s1=new Scanner(System.in);
               int z = s1.nextInt();
               //write ypur logic here                 
               String a[] ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}
               for (int b=1;b<=z;b++)
               {
                     for (int c=1;c<=z-b+1;c++)
                     {
                            System.out.print(" ");
                    }
                    for (int d =0;d<b;d++)
                    {
                            System.out.print(a[d]+" ");
                     }
                     System.out.println();
                    }
       }
}