Write a program for the below requirements

* calculate sum and product of the given number
* if sum equals to product print it is a spy number and print the given number in reverse order
* if sum and product not equal, print it is not a spy number.



Note : use only while loop



Sample Test Case : 1

123
sum of the given number is: 6
product of the given number is: 6
it is a spy number
Given number in reverse order: 321
Sample Test Case : 2

456
sum of the given number is: 15
product of the given number is: 120
it is not a spy number
Sample Test Cases

Test Case 1:
Expected Output:
123
sum·of·the·given·number·is:·6
product·of·the·given·number·is:·6
it·is·a·spy·number
Given·number·in·reverse·order:·321

Test Case 2:
Expected Output:
456
sum·of·the·given·number·is:·15
product·of·the·given·number·is:·120
it·is·not·a·spy·number

Test Case 3:
Expected Output:
1124
sum·of·the·given·number·is:·8
product·of·the·given·number·is:·8
it·is·a·spy·number
Given·number·in·reverse·order:·4211

Test Case 4:
Expected Output:
1234
sum·of·the·given·number·is:·10
product·of·the·given·number·is:·24
it·is·not·a·spy·number



package q1165;
import java.util.Scanner;
class SpyNumber {
  public static void main(String[] args) {
     Scanner s1 = new Scanner(System.in);
     // write your code here
     int x = s1.nextInt();
     int a,b=0,c=1;
     int y =x;
     int sum =0;
     while (y>0)
     {
          a=y%10;
          b+=a;
          c*=a;
          sum=(sum*10)+a;
          y/=10;
     }
          System.out.println("sum of the given number is: "+b);
          System.out.println("product of the given number is: "+c);
          if (b==c)
          {
                    System.out.println("it is a spy number");
                    System.out.println("Given number in reverse order: "+sum);
          }
          else
          {
                    System.out.println("it is not a spy number");
          }
    }
}