import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // crete scanner for user input
    Scanner input= new Scanner(System.in);
final int INTEGERS1 = 3;
final int INTEGERS2 = 3;
double sum = 0;
    //create an array with 10 spots
    double[] user1 = new double[INTEGERS1];
    double[] user2 = new double[INTEGERS2];
//put integers into the array using a loop
 System.out.println("Please enter the 3 values for the first vector");
for(int i =0; i < INTEGERS1; i++){
    user1[i] = input.nextDouble();
}

// user a for loop to go through the array and find the number
 System.out.println("Please enter the 3 values for the second vector");
for(int i = 0; i < INTEGERS2; i++){
     user2[i] = input.nextDouble();
}

sum = (user1[0] * user2[0]) + (user1[1] * user2[1]) + (user1[2] * user2[2]);
System.out.println("The dot product is " + sum);
}
}