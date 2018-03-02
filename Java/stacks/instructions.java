import java.util.Scanner;
public class instructions {


public static void main(String args[] ) throws Exception {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many instructions? :");
        int length = scan.nextInt();

        stringStack st = new stringStack(length);

        String line[] = scan.nextLine().split(" ");

       

        while(line[0].matches("Arrived") == false){

            if(line[1].matches("Back")){

                st.pop();

            }

           

            else{

                st.push(line[1]);

            }

            line = scan.nextLine().split(" ");

        }

       

        while(st.isEmpty() == false){

            String s = st.pop();

           

            if(s.matches("North")) System.out.println("Go South");

            else if(s.matches("South")) System.out.println("Go North");

            else if(s.matches("West")) System.out.println("Go East");

            else if(s.matches("East")) System.out.println("Go West");

        }

    }
}