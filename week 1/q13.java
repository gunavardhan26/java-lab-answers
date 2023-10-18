A task is assigned to a student,in which the student has to categorise the metal blocks in different boxes based 
on their weight.He can weigh only two metal blocks, at a time.
Write a program which takes weights of two metal boxes and displays a list which includes all relations between 
the weights.(Observe the sample test case).

Sample Test Case:

Enter the weight of object1: 50.5
Enter the weight of object2: 30.6
Relation between object1 and object2:
object1 == object2 = false
object1 != object2 = true
object1 > object2 = true
object1 < object2 = false
object1 >= object2 = true
object1 <= object2 = false

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·weight·of·object1:·50.5
Enter·the·weight·of·object2:·30.6
Relation·between·object1·and·object2:
object1·==·object2·=·false
object1·!=·object2·=·true
object1·>·object2·=·true
object1·<·object2·=·false
object1·>=·object2·=·true
object1·<=·object2·=·false

Test Case 2:

Expected Output:
Enter·the·weight·of·object1:·20.896
Enter·the·weight·of·object2:·54.69
Relation·between·object1·and·object2:
object1·==·object2·=·false
object1·!=·object2·=·true
object1·>·object2·=·false
object1·<·object2·=·true
object1·>=·object2·=·false
object1·<=·object2·=·true

Test Case 3:

Expected Output:
Enter·the·weight·of·object1:·55.5
Enter·the·weight·of·object2:·55.5
Relation·between·object1·and·object2:
object1·==·object2·=·true
object1·!=·object2·=·false
object1·>·object2·=·false
object1·<·object2·=·false
object1·>=·object2·=·true
object1·<=·object2·=·true

Test Case 4:

Expected Output:
Enter·the·weight·of·object1:·452.369
Enter·the·weight·of·object2:·500.258
Relation·between·object1·and·object2:
object1·==·object2·=·false
object1·!=·object2·=·true
object1·>·object2·=·false
object1·<·object2·=·true
object1·>=·object2·=·false
object1·<=·object2·=·true

package q1143;
import java.util.Scanner; public class RelationalOperations{
public static void main(String[] args){
//write your code below
Scanner a = new Scanner(System.in);
System.out.println("Enter the weight of object1: "); 
System.out.print("Enter the weight of object2: ");
float x=a.nextFloat();
float y=a.nextFloat();
System.out.println("Relation between object1 and object2:"); 
System.out.println("object1 object2 "+(x==y));
System.out.println("object1 != object2 "+(x!=y));
System.out.println("object1 > object2 = "+(x>y)); 
System.out.println("object1 < object2 = +(x<y));
System.out.println("object1>= object2 = "+(x>=y)); 
System.out.println("object1 <= object2 "+(x<=y));
}
}