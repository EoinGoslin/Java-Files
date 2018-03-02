/*
* Go North
Go North
Go West
Go Back
Arrived
Sample Output
Go South
Go South
*Go Back undoes last step
return what is needed to getHome
*/
import java.util.Scanner;
public class getHome {
    public static void main (String[] args) {

    Scanner userScan = new Scanner(System.in);
    System.out.println("How many instructions? :");
    int length = userScan.nextInt();userScan.nextLine();//clean the line
    stringStack stack = new stringStack(length);
    
    System.out.println("Enter instruction?:");
    String[] command = userScan.nextLine().split(" ");//split instruction into two
    
    while(command[0].equals("Arrived") == false) {//while we have not uet arrived
        if(command[1].equals("Back")) {//if "Back" get rid of last command 
            stack.pop();
        } else if(command[1].equals("North")) {
            stack.push("South");
        } else if(command[1].equals("South")) {
            stack.push("North");
        } else if(command[1].equals("East")) {
            stack.push("West");
        } else if(command[1].equals("West")) {
            stack.push("East");
        } else {
            System.out.println("That is not a direction");
        }


        command = userScan.nextLine().split(" ");


    }

    while(!stack.isEmpty()) {
        System.out.println(stack.pop());//printing out instructions to get home
    }

}
}